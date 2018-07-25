package com.splendid.product.controller;

import com.splendid.common.bean.product.PrdInfo;
import com.splendid.product.service.IPrdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/prd")
public class PorudctController {

	@Autowired
	IPrdService prdService;

	/**
	 * get a product info
	 *
	 * @param prdId
	 * @return
	 */
	@RequestMapping(value = "{prdId}", method = RequestMethod.POST)
	public PrdInfo getPorudctById(String prdId) {
		return prdService.getProductById(prdId);
	}

	/**
	 * 获取商品列表
	 *
	 * @return
	 */
	@RequestMapping(value = "list", method = RequestMethod.POST)
	public List<PrdInfo> list() {
		return prdService.queryPrdList();
	}

}
