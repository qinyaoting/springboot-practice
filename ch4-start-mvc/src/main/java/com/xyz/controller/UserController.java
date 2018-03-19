package com.xyz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/19/18
 * Time: 9:23 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Controller
public class UserController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
