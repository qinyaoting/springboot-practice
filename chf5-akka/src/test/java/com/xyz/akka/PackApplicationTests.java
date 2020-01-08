package com.xyz.akka;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import com.xyz.AkkaApp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AkkaApp.class)
public class PackApplicationTests {

    @Autowired
    private ActorSystem actorSystem;        //1-在ScanConfig初始好的

    @Test
    public void contextLoads() {

        ExecutorService mExecutorService = Executors.newFixedThreadPool(5);
        ActorRef ref = actorSystem.actorOf(SpringExtProvider.getInstance().get(actorSystem).create("gatherActor"), "gatherActor");
        for (int i=0;i<20;i++) {
            int finalI = i;
            mExecutorService.submit(new Callable<Object>() {
                @Override
                public Object call() throws Exception {
                    ref.tell("hello"+ finalI, ActorRef.noSender());
                    return null;
                }
            });
        }
    }
}

