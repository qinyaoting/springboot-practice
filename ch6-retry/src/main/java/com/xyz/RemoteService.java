package com.xyz;

import org.springframework.remoting.RemoteAccessException;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 5/3/18
 * Time: 3:51 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Service
public class RemoteService {


    // 重试三次
    // 重试5000ms, 下次会
    //

    @Retryable(value = {RemoteAccessException.class}, maxAttempts = 3, backoff = @Backoff(delay = 5000l,multiplier = 1))
    public void call() throws Exception {
        System.out.println("do something...");
        throw new RemoteAccessException("RPC error");
    }

    @Recover
    public void recover(RemoteAccessException e) {
        System.out.println(e.getMessage());
    }
}
