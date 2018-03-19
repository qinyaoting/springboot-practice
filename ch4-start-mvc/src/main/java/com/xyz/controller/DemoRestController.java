package com.xyz.controller;

import com.xyz.domain.DemoObj;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/19/18
 * Time: 10:26 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@RestController
@RequestMapping("/rest")
public class DemoRestController {


    // http://localhost:9090/rest/json?id=1&name=jack
    @RequestMapping(value = "/json", produces = {"application/json;charset=utf-8"})
    public DemoObj getJson(DemoObj param) {
        return new DemoObj(param.getId(), param.getName());
    }

//    http://localhost:9090/rest/xml?id=1&name=jack
    @RequestMapping(value = "/xml", produces = "application/xml;charset=utf-8")
    public DemoObj getXml(DemoObj param) {
        return new DemoObj(param.getId(), param.getName());
    }
}
