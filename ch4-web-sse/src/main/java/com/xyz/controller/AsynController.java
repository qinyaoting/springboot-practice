package com.xyz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.async.DeferredResult;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/22/18
 * Time: 1:48 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Controller
public class AsynController {

    @Autowired
    private PushService pushService;

    @RequestMapping("/defer")
    @ResponseBody
    public DeferredResult<String> defeeredCall() {
        return pushService.getDeferredResult();
    }


}
