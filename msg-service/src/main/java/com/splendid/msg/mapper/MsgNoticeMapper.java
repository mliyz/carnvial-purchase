package com.splendid.msg.mapper;

import com.splendid.msg.bean.MsgNotice;
import com.splendid.msg.bean.MsgNoticeCriteria;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MsgNoticeMapper {
    long countByExample(MsgNoticeCriteria example);

    int deleteByExample(MsgNoticeCriteria example);

    int deleteByPrimaryKey(String tid);

    int insert(MsgNotice record);

    int insertSelective(MsgNotice record);

    List<MsgNotice> selectByExample(MsgNoticeCriteria example);

    MsgNotice selectByPrimaryKey(String tid);

    int updateByExampleSelective(@Param("record") MsgNotice record, @Param("example") MsgNoticeCriteria example);

    int updateByExample(@Param("record") MsgNotice record, @Param("example") MsgNoticeCriteria example);

    int updateByPrimaryKeySelective(MsgNotice record);

    int updateByPrimaryKey(MsgNotice record);
}