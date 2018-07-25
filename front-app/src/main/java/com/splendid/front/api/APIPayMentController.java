package com.splendid.front.api;

import com.splendid.common.bean.RestAPIResult;
import com.splendid.common.constant.SystemConstants;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

@Api(value = "支付服务", tags = "支付服务接口")
@RestController
@RequestMapping("/payment")
public class APIPayMentController {

	private final static String PAY_SERVICE_URL = "http://PAYMENT-SERVICE:8082";

	private final static String ORDER_SERVICE_URL = "http://ORDER-SERVICE:8083";

	@Autowired
	LoadBalancerClient loadBalancerClient;

	@Autowired
    RestTemplate restTemplate;

	@ApiOperation(value = "支付")
	@RequestMapping(value = "pay", method = RequestMethod.POST)
	public RestAPIResult<Boolean> pay(@RequestParam("serialNo") String serialNo,
									  @RequestParam("payType") String payType, @RequestParam("price") BigDecimal price, String accessToken) {
		// this.loadBalancerClient.choose(PAY_SERVICE);
		// 采用微服务的事件驱动机制，不在此直接调用两个服务
		RestAPIResult<Boolean> restAPIResult = new RestAPIResult<>();
		MultiValueMap<String, Object> uriVariable = new LinkedMultiValueMap<>();
		uriVariable.add("serialNo", serialNo);
		uriVariable.add("payType", payType);
		uriVariable.add("price", price);
		int payResult = restTemplate.postForObject(PAY_SERVICE_URL + "/payment/pay", uriVariable, Integer.class);
		if (SystemConstants.Code.success == payResult) {
			// notice order system to update order state
			MultiValueMap<String, Object> uriNoticeVariable = new LinkedMultiValueMap<>();
			uriNoticeVariable.add("serialNo", serialNo);
			uriNoticeVariable.add("payStatus", SystemConstants.PAY_STATUS.PAID);
			uriNoticeVariable.add("orderStatus", SystemConstants.STATE.SHIPPING);
			int update = restTemplate.postForObject(ORDER_SERVICE_URL + "/order/state/change", uriNoticeVariable,
					Integer.class);
			// FIXME 存在数据一致性问题，后期待优化
			if ((payResult + update) < 1) {
				restAPIResult = new RestAPIResult<>("支付失败，请稍后重试！");
			}
		}
		return restAPIResult;
	}
}
