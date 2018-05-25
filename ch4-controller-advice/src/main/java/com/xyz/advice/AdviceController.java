package com.xyz.advice;

import com.xyz.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/20/18
 * Time: 3:19 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Controller
public class AdviceController {


    // http://localhost:9090/advice?id=1&xxx=1
    @RequestMapping("/advice")
    public String biz(@ModelAttribute("msg") String msg, DemoObj obj) {
        throw new IllegalArgumentException("参数有误.");
    }
}
