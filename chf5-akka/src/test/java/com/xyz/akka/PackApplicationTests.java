package com.xyz.akka;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import com.xyz.AkkaApp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AkkaApp.class)
public class PackApplicationTests {

    @Autowired
    private ActorSystem actorSystem;

    @Test
    public void contextLoads() {
        ActorRef ref = actorSystem.actorOf(SpringExtProvider.getInstance().get(actorSystem).create("testActor"), "testActor");
        ref.tell("hello",ActorRef.noSender());
    }
}

