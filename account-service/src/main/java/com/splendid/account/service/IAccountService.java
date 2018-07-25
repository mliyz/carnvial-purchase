package com.splendid.account.service;

import com.splendid.common.bean.account.Account;

/**
 *@Author : 禹璋
 *@Description:用户
 *@Date: 2018/7/20
 *@Time：9:30
 */
public interface IAccountService {
    /**
     * @Description:登陆
     * @param phone
     * @param password
     * @return
     */
    Account login(String phone, String password);

    /**
     * @Description:注册
     * @param phone
     * @param password
     * @return
     */
    boolean signup(String phone, String password);
}
