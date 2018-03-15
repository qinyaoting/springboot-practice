package com.xyz.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/15/18
 * Time: 8:11 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        System.out.println(demoEvent.getMsg());
    }
}
