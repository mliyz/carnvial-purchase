package com.splendid.order.mapper;

import com.splendid.common.bean.order.OrderProdut;
import com.splendid.common.bean.order.OrderProdutCriteria;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderProdutMapper {
    long countByExample(OrderProdutCriteria example);

    int deleteByExample(OrderProdutCriteria example);

    int deleteByPrimaryKey(String tid);

    int insert(OrderProdut record);

    int insertSelective(OrderProdut record);

    List<OrderProdut> selectByExample(OrderProdutCriteria example);

    OrderProdut selectByPrimaryKey(String tid);

    int updateByExampleSelective(@Param("record") OrderProdut record, @Param("example") OrderProdutCriteria example);

    int updateByExample(@Param("record") OrderProdut record, @Param("example") OrderProdutCriteria example);

    int updateByPrimaryKeySelective(OrderProdut record);

    int updateByPrimaryKey(OrderProdut record);
}