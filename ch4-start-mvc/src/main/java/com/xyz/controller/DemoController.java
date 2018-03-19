package com.xyz.controller;

import com.xyz.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/19/18
 * Time: 9:37 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Controller
@RequestMapping("/anno")
public class DemoController {

    @RequestMapping(produces = "text/plain;charset=utf-8")
    public @ResponseBody String index(HttpServletRequest request) {
        return "url" + request.getRequestURL() + "can access";
    }


    @RequestMapping(value = "/pathvar/{str}", produces = "text/plain;charset=utf-8")
    public @ResponseBody String pathVarialbe(@PathVariable String str, HttpServletRequest request) {
        return "url:" + request.getRequestURL() + "can access:" + str;
    }


    // http://localhost:9090/anno/params?id=1
    @RequestMapping(value = "/params", produces = "text/plain;charset=utf-8")
    public @ResponseBody String passRequestParam(Long id, HttpServletRequest request) {
        return "url:" + request.getRequestURL() + "can access";
    }

    // http://localhost:9090/anno/obj?id=1&name=xx
    @RequestMapping(value = "/obj", produces = "text/json;charset=utf-8")
    @ResponseBody
    public  String passObject(DemoObj obj, HttpServletRequest request) {
        return "url:" + request.getRequestURL() + "can access:"
                +obj.toString();
    }

    // http://localhost:9090/anno/name1 http://localhost:9090/anno/name2
    @RequestMapping(value = {"/name1", "/name2"}, produces = "text/plain;charset=utf-8")
    public @ResponseBody String remove(HttpServletRequest request) {
        return "url" + request.getRequestURL() + "can access";
    }
}
