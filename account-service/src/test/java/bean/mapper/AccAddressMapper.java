package bean.mapper;

import bean.AccAddress;
import bean.AccAddressCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccAddressMapper {
    long countByExample(AccAddressCriteria example);

    int deleteByExample(AccAddressCriteria example);

    int deleteByPrimaryKey(String tid);

    int insert(AccAddress record);

    int insertSelective(AccAddress record);

    List<AccAddress> selectByExample(AccAddressCriteria example);

    AccAddress selectByPrimaryKey(String tid);

    int updateByExampleSelective(@Param("record") AccAddress record, @Param("example") AccAddressCriteria example);

    int updateByExample(@Param("record") AccAddress record, @Param("example") AccAddressCriteria example);

    int updateByPrimaryKeySelective(AccAddress record);

    int updateByPrimaryKey(AccAddress record);
}