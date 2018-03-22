package com.xyz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/22/18
 * Time: 1:25 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Controller
public class SseController {


    // http://localhost:9091/ch4-web-sse/sse
    @RequestMapping(value = "/push", produces = "text/event-stream")
    public @ResponseBody String push() {
        Random random = new Random();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "data:test 1,2,3" + random.nextInt()+"\n";
    }
}
