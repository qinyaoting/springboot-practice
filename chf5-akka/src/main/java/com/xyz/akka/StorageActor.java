package com.xyz.akka;

import akka.actor.AbstractActor;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)     //3-不能是单例
public class StorageActor extends AbstractActor {

    @Override
    public Receive createReceive() {


        return receiveBuilder().matchAny(o -> {
            System.out.println("接受到消息：" + o);
        }).build();
    }
}
