package com.splendid.account.service.impl;

import com.splendid.account.dal.AccountMapper;
import com.splendid.account.service.IAccountService;
import com.splendid.common.bean.account.Account;
import com.splendid.common.bean.account.AccountCriteria;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@Author : 禹璋
 *@Description:用户
 *@Date: 2018/7/20
 *@Time：9:40
 */
@Service
public class AccountServiceImpl implements IAccountService {

    private Logger logger = LoggerFactory.getLogger(AccountServiceImpl.class);

    @Autowired
    AccountMapper accountMapper;

    /**
     * @Description:登陆
     * @param phone
     * @param password
     * @return
     *
     */
    @Override
    public Account login(String phone, String password) {
        AccountCriteria accountCriteria = new AccountCriteria();
        //查询条件
        accountCriteria.createCriteria().andPhoneEqualTo(phone).andPasswordEqualTo(password);
        List<Account> list = accountMapper.selectByExample(accountCriteria);
        if(CollectionUtils.isNotEmpty(list)){
            logger.info("{}登陆成功!",phone);
            return list.get(0);
        }
        logger.warn("{}登陆失败!",phone);
        return new Account();
    }

    /**
     * @Description:注册
     * @param phone
     * @param password
     * @return
     *
     */
    @Override
    public boolean signup(String phone, String password) {
        Account account = new Account();
        //手机号
        account.setPhone(phone);
        //密码
        account.setPassword(password);
        AccountCriteria example = new AccountCriteria();
        //查询条件
        example.createCriteria().andPhoneEqualTo(phone);
        List<Account> list = accountMapper.selectByExample(example);
        if (CollectionUtils.isNotEmpty(list)){
            logger.warn("{}-用户已存在，请选择其他用户名!",phone);
            return false;
        }
        //注册用户
        int result = accountMapper.insertSelective(account);
        logger.info("{}注册成功!",phone);
        return result > 0 ? true : false;
    }
}
