package com.splendid.account.dal;


import com.splendid.common.bean.account.Account;
import com.splendid.common.bean.account.AccountCriteria;
import org.apache.ibatis.annotations.Param;

import java.util.List;
 /**
  *@Author : 禹璋
  *@Description: 用户基本信息
  *@Date: 2018/7/20
  *@Time：9:19
  */
public interface AccountMapper {
    /**
     * 根据条件计数
     *
     * @param example
     */
    long countByExample(AccountCriteria example);
    
    /**
     *
     * @param example
     */
    int deleteByExample(AccountCriteria example);
    
    /**
     * 根据主键删除数据库的记录
     *
     * @param tid
     */
    int deleteByPrimaryKey(String tid);
    
    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insert(Account record);
    
    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insertSelective(Account record);
    
    /**
     * 根据条件查询列表
     *
     * @param example
     */
    List<Account> selectByExample(AccountCriteria example);
    
    /**
     * 根据主键获取一条数据库记录
     *
     * @param tid
     */
    Account selectByPrimaryKey(String tid);
    
    /**
     * 选择性更新数据库记录
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") Account record, @Param("example") AccountCriteria example);
    
    /**
     * 选择性更新数据库记录
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") Account record, @Param("example") AccountCriteria example);
    
    /**
     * 根据主键来更新部分数据库记录
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Account record);
    
    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(Account record);
}