package com.splendid.msg.controller;

import com.splendid.common.bean.RestAPIResult;
import com.splendid.msg.service.IMsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 消息通知，短信/邮件
 *
 * @author liyuzhang
 * @date 2018年7月23日 上午:10:18:37
 */

@RestController
@RequestMapping("/msg")
public class MsgController {

    @Autowired
    IMsgService msgService;

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public RestAPIResult<Integer> addMsg(String serialNo, String msgType, String target, String content){
        RestAPIResult<Integer> apiResult = new RestAPIResult<>();
        int result = msgService.addMsg(serialNo, msgType, target, content);
        apiResult.setRespData(result);
        return apiResult;
    }

}
