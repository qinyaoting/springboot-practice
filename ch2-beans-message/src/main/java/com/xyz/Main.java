package com.xyz;

import com.xyz.event.MessagePublisher;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/15/18
 * Time: 8:09 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Main {

    public static void main(String[] args) {

        // 给bean发消息, DemoListener会收到消息
        // 用ApplicationContext.publish发送消息

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(EventConfig.class);
        MessagePublisher demoPublisher = context.getBean(MessagePublisher.class);
        demoPublisher.publish();
        context.close();
    }
}
