package com.splendid.product.mapper;

import com.splendid.common.bean.product.PrdExtend;
import com.splendid.common.bean.product.PrdExtendCriteria;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PrdExtendMapper {
    long countByExample(PrdExtendCriteria example);

    int deleteByExample(PrdExtendCriteria example);

    int deleteByPrimaryKey(String tid);

    int insert(PrdExtend record);

    int insertSelective(PrdExtend record);

    List<PrdExtend> selectByExample(PrdExtendCriteria example);

    PrdExtend selectByPrimaryKey(String tid);

    int updateByExampleSelective(@Param("record") PrdExtend record, @Param("example") PrdExtendCriteria example);

    int updateByExample(@Param("record") PrdExtend record, @Param("example") PrdExtendCriteria example);

    int updateByPrimaryKeySelective(PrdExtend record);

    int updateByPrimaryKey(PrdExtend record);
}