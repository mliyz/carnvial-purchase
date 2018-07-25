package com.splendid.order.mapper;

import com.splendid.common.bean.order.OrderState;
import com.splendid.common.bean.order.OrderStateCriteria;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderStateMapper {
    long countByExample(OrderStateCriteria example);

    int deleteByExample(OrderStateCriteria example);

    int deleteByPrimaryKey(String tid);

    int insert(OrderState record);

    int insertSelective(OrderState record);

    List<OrderState> selectByExample(OrderStateCriteria example);

    OrderState selectByPrimaryKey(String tid);

    int updateByExampleSelective(@Param("record") OrderState record, @Param("example") OrderStateCriteria example);

    int updateByExample(@Param("record") OrderState record, @Param("example") OrderStateCriteria example);

    int updateByPrimaryKeySelective(OrderState record);

    int updateByPrimaryKey(OrderState record);
}