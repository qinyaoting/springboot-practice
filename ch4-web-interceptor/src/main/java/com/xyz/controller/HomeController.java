package com.xyz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/20/18
 * Time: 3:04 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@RestController
@RequestMapping("/index")
public class HomeController {

    @RequestMapping(value = "/pass", produces = {"application/json;charset=utf-8"})
    public String getJson(HttpServletRequest request) {
       return "====" + request.getAttribute("handlingTime");
    }
}
