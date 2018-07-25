package com.splendid.order.mapper;

import com.splendid.common.bean.order.OrderInfo;
import com.splendid.common.bean.order.OrderInfoCriteria;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderInfoMapper {
    long countByExample(OrderInfoCriteria example);

    int deleteByExample(OrderInfoCriteria example);

    int deleteByPrimaryKey(String tid);

    int insert(OrderInfo record);

    int insertSelective(OrderInfo record);

    List<OrderInfo> selectByExample(OrderInfoCriteria example);

    OrderInfo selectByPrimaryKey(String tid);

    int updateByExampleSelective(@Param("record") OrderInfo record, @Param("example") OrderInfoCriteria example);

    int updateByExample(@Param("record") OrderInfo record, @Param("example") OrderInfoCriteria example);

    int updateByPrimaryKeySelective(OrderInfo record);

    int updateByPrimaryKey(OrderInfo record);
}