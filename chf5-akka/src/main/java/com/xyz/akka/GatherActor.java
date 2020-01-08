package com.xyz.akka;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)     //3-不能是单例
public class GatherActor extends AbstractActor {

    @Autowired
    private ActorSystem actorSystem;


    @Override
    public Receive createReceive() {

        ActorRef ref = actorSystem.actorOf(SpringExtProvider.getInstance().get(actorSystem).create("storageActor"), "storageActor");
        return receiveBuilder().matchAny(o -> {
            System.out.println("接受到消息：" + o);
            ref.tell("save this.", this.sender());
        }).build();
    }
}
