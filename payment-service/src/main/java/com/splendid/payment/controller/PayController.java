package com.splendid.payment.controller;

import com.splendid.payment.service.IPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/payment")
public class PayController {

	@Autowired
	IPayService payService;

	/**
	 * pay
	 *
	 * @param serialNo
	 * @param payType
	 * @return
	 */
	@RequestMapping(value = "pay", method = RequestMethod.POST)
	public Integer pay(@RequestParam(value = "serialNo") String serialNo, @RequestParam(value = "payType") String payType,
                       @RequestParam(value = "price") BigDecimal price, String jwtToken) {
		int result = payService.pay(serialNo, payType, price);
		return result;
	}
}
