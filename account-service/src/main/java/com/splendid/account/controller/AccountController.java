package com.splendid.account.controller;

import com.splendid.account.service.IAccountService;
import com.splendid.common.bean.account.Account;
import com.splendid.common.constant.SystemConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *@Author : 禹璋
 *@Description:个人账户
 *@Date: 2018/7/20
 *@Time：10:04
 */
@RestController
@RequestMapping("/acc")
public class AccountController {

    @Autowired
    IAccountService accountService;

    /**
     * 登陆
     * @param phone
     * @param password
     * @return Account
     */
    @RequestMapping(value = "/login", method = {RequestMethod.GET,RequestMethod.POST})
    public Account login(@RequestParam("phone") String phone, @RequestParam("password") String password){
        Account login = accountService.login(phone, password);
        return login;
    }

    /**
     * 注册
     * @param phone
     * @param password
     * @return
     */
    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String signup(@RequestParam("phone") String phone, @RequestParam("password") String password){
        boolean signup = accountService.signup(phone, password);
        return signup ? SystemConstants.Code.SUCCESS : SystemConstants.Code.FAIL;
    }

}
