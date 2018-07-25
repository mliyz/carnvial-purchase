package bean.mapper;

import bean.MsgNotice;
import bean.MsgNoticeCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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