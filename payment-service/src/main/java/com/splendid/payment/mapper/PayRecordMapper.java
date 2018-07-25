package com.splendid.payment.mapper;

import com.splendid.payment.bean.PayRecord;
import com.splendid.payment.bean.PayRecordCriteria;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PayRecordMapper {
    long countByExample(PayRecordCriteria example);

    int deleteByExample(PayRecordCriteria example);

    int deleteByPrimaryKey(String tid);

    int insert(PayRecord record);

    int insertSelective(PayRecord record);

    List<PayRecord> selectByExample(PayRecordCriteria example);

    PayRecord selectByPrimaryKey(String tid);

    int updateByExampleSelective(@Param("record") PayRecord record, @Param("example") PayRecordCriteria example);

    int updateByExample(@Param("record") PayRecord record, @Param("example") PayRecordCriteria example);

    int updateByPrimaryKeySelective(PayRecord record);

    int updateByPrimaryKey(PayRecord record);
}