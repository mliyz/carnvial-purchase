package com.splendid.front.client;

import com.splendid.common.bean.product.PrdInfo;
import com.splendid.front.client.hystrix.ProductFeignClientHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * get product detail info
 *
 * @author guooo
 *
 */
@FeignClient(name = "PRODUCT-SERVICE",fallback = ProductFeignClientHystrix.class)
public interface ProductFeignClient {

	@RequestMapping(value = "/prd/{prdId}",method = RequestMethod.POST)
	public PrdInfo getPorudctById(@RequestParam(value = "prdId", required = true) @PathVariable("prdId") String prdId);

	@RequestMapping(value = "/prd/list",method = RequestMethod.POST)
	public List<PrdInfo> list();
}
