package com.splendid.account.service.impl;

import com.splendid.account.dal.AccAddressMapper;
import com.splendid.account.service.AccAddressService;
import com.splendid.common.bean.account.AccAddress;
import com.splendid.common.bean.account.AccAddressCriteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@Author : 禹璋
 *@Description:收货地址
 *@Date: 2018/7/20
 *@Time：9:58
 */
@Service
public class AccaddressServiceImpl implements AccAddressService {

    private Logger logger = LoggerFactory.getLogger(AccaddressServiceImpl.class);

    @Autowired
    AccAddressMapper accAddressMapper;

    /**
     * @Description:通过id查询收获地址
     * @param tid
     * @return
     */
    @Override
    public AccAddress getAccAddress(String tid) {
        return accAddressMapper.selectByPrimaryKey(tid);
    }

    /**
     * @Description:获取用户的收获地址
     * @param accountId
     * @return
     */
    @Override
    public List<AccAddress> getAddressList(String accountId) {
        AccAddressCriteria criteria = new AccAddressCriteria();
        //查询条件
        criteria.createCriteria().andAccountIdEqualTo(accountId);
        List<AccAddress> list = accAddressMapper.selectByExample(criteria);
        return list;
    }
}
