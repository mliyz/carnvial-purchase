package com.splendid.payment.service.impl;

import com.splendid.common.constant.SystemConstants;
import com.splendid.payment.bean.PayRecord;
import com.splendid.payment.mapper.PayRecordMapper;
import com.splendid.payment.service.IPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class PayServiceImpl implements IPayService {

	@Autowired
	PayRecordMapper recordMapper;

	@Override
	public int pay(String serialNo, String payType,BigDecimal price) {
		PayRecord record = new PayRecord();
//		record.setPrice(Float.valueOf(String.valueOf(price)));
		record.setSerialNo(serialNo);
		record.setType(payType);
		record.setStatus(SystemConstants.PAY_STATUS.PAID);
		return recordMapper.insertSelective(record);
	}

}
