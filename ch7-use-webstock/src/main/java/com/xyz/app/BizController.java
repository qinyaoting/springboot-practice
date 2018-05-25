package com.xyz.app;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 5/25/18
 * Time: 10:39 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Controller
public class BizController {

    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public CustomResponse sayHi(CustomMessage message) throws InterruptedException {
        Thread.sleep(3000);
        return new CustomResponse("blackdog");
    }
}
