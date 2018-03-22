package com.xyz.controller;

import com.xyz.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/22/18
 * Time: 2:37 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Controller
public class RestController {

    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "testrest", produces = "text/plain;charset=utf-8")
    public @ResponseBody String testRest() {
        return demoService.saySomething();
    }


}
