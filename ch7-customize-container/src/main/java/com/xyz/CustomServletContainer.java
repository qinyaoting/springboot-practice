package com.xyz;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.ErrorPage;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 5/24/18
 * Time: 10:18 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
//@Component
public class CustomServletContainer implements EmbeddedServletContainerCustomizer {     //241.

    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
        container.setPort(8888);
        container.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/404.html"));
        container.setSessionTimeout(10, TimeUnit.SECONDS);
    }
}
