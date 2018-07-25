package com.splendid.front.client.hystrix;

import com.splendid.front.client.OrderFeignClient;
import org.springframework.stereotype.Component;

@Component
public class OrderFeignClientHystrix implements OrderFeignClient {

	@Override
	public String createOrder(String orderJsonStr) {
		return "create failed!";
	}

}
