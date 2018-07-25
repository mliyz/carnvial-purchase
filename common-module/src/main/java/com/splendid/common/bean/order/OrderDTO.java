package com.splendid.common.bean.order;

import lombok.Data;

import java.util.List;

@Data
public class OrderDTO {

	OrderInfo baseInfo;

	List<OrderProdut> products;

	List<OrderState> stateChanges;

	public OrderInfo getBaseInfo() {
		return baseInfo;
	}

	public void setBaseInfo(OrderInfo baseInfo) {
		this.baseInfo = baseInfo;
	}

	public List<OrderProdut> getProducts() {
		return products;
	}

	public void setProducts(List<OrderProdut> products) {
		this.products = products;
	}

	public List<OrderState> getStateChanges() {
		return stateChanges;
	}

	public void setStateChanges(List<OrderState> stateChanges) {
		this.stateChanges = stateChanges;
	}
}
