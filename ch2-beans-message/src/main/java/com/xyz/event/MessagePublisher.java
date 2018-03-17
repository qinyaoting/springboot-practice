package com.xyz.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/15/18
 * Time: 8:12 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Component
public class MessagePublisher {

    @Autowired
    private ApplicationContext applicationContext;

    public void publish() {
        applicationContext.publishEvent(new DemoEvent(this, "666"));
    }
}
