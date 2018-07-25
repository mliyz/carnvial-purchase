package com.splendid.msg.service.impl;

import com.splendid.msg.bean.MsgNotice;
import com.splendid.msg.mapper.MsgNoticeMapper;
import com.splendid.msg.service.IMsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MsgServiceImpl implements IMsgService {

    /**
     *
     */
    @Autowired
    MsgNoticeMapper msgNoticeMapper;

    /**
     * add a new message
     * @param serialNo
     * @param msgType
     * @param target
     * @param content
     * @return
     */
    @Override
    @Transactional
    public int addMsg(String serialNo, String msgType, String target, String content) {
        MsgNotice notice = new MsgNotice();
        notice.setSerialNo(serialNo);
        notice.setTargetAddress(target);
        notice.setTargetType(msgType);
        notice.setContent(content);
        int rtn = msgNoticeMapper.insertSelective(notice);
        return rtn;
    }
}
