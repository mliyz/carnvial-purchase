package com.splendid.msg.service;

/**
 * 消息通知，短信/邮件
 *
 * @author liyuzhang
 * @date 2018年7月23日 上午:10:05:34
 */
public interface IMsgService {

    /**
     * add a new message
     *
     * @param serialNo
     * @param msgType
     * @param target
     * @param content
     * @return
     */
    int addMsg(String serialNo, String msgType, String target, String content);
}
