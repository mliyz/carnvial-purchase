package com.splendid.product.service;


import com.splendid.common.bean.product.PrdInfo;

import java.util.List;

public interface IPrdService {

	/**
	 * 商品详情
	 *
	 * @param prdId
	 * @return
	 */
	PrdInfo getProductById(String prdId);

	/**
	 * 获取商品列表
	 *
	 * @return
	 */
	List<PrdInfo> queryPrdList();
}
