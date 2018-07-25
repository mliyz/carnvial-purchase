package com.splendid.account.controller;

import com.splendid.account.service.AccAddressService;
import com.splendid.account.service.IAccountService;
import com.splendid.common.bean.account.AccAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *@Author : 禹璋
 *@Description:收货地址
 *@Date: 2018/7/20
 *@Time：10:17
 */
@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    AccAddressService addressService;

    /**
     * 查询用户收货地址
     * @param accountTid
     * @param jwtToken
     * @return
     */
    @RequestMapping("/list/{accountTid}")
    public List<AccAddress> getList(@RequestParam(required = true) @PathVariable("accountTid") String accountTid, String jwtToken){
        List<AccAddress> list = addressService.getAddressList(accountTid);
        return list;
    }

    /**
     * 获取收货地址
     * @param tid
     * @return
     */
    @RequestMapping("/getAddr")
    public AccAddress getAddr(@RequestParam("tid") String tid){
        AccAddress address = addressService.getAccAddress(tid);
        return address;
    }

}
