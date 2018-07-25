package com.splendid.account.service;

import com.splendid.common.bean.account.AccAddress;

import java.util.List;

/**
 *@Author : 禹璋
 *@Description:收货地址
 *@Date: 2018/7/20
 *@Time：9:35
 */
public interface AccAddressService {
    /**
     * @Description:通过id查询收获地址
     * @param tid
     * @return
     */
    AccAddress getAccAddress(String tid);

    /**
     * @Description:获取用户的收获地址
     * @param accountId
     * @return
     */
    List<AccAddress> getAddressList(String accountId);
}
