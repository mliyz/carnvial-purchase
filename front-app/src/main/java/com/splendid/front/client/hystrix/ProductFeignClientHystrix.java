package com.splendid.front.client.hystrix;
import com.splendid.common.bean.product.PrdInfo;
import com.splendid.front.client.ProductFeignClient;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 生成空对象，防止出现Null，对调用方造成其他问题
 *
 */
@Component
public class ProductFeignClientHystrix implements ProductFeignClient {

	@Override
	public PrdInfo getPorudctById(String prdId) {
		return new PrdInfo();
	}

	@Override
	public List<PrdInfo> list() {
		return new ArrayList<>();
	}

}
