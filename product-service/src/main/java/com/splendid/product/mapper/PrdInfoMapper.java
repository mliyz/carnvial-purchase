package com.splendid.product.mapper;

import com.splendid.common.bean.product.PrdInfo;
import com.splendid.common.bean.product.PrdInfoCriteria;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PrdInfoMapper {
    long countByExample(PrdInfoCriteria example);

    int deleteByExample(PrdInfoCriteria example);

    int deleteByPrimaryKey(String tid);

    int insert(PrdInfo record);

    int insertSelective(PrdInfo record);

    List<PrdInfo> selectByExample(PrdInfoCriteria example);

    PrdInfo selectByPrimaryKey(String tid);

    int updateByExampleSelective(@Param("record") PrdInfo record, @Param("example") PrdInfoCriteria example);

    int updateByExample(@Param("record") PrdInfo record, @Param("example") PrdInfoCriteria example);

    int updateByPrimaryKeySelective(PrdInfo record);

    int updateByPrimaryKey(PrdInfo record);
}