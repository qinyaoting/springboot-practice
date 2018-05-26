package com.xyz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.ErrorPage;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 5/24/18
 * Time: 10:34 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@SpringBootApplication
public class Main {

    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);
    }

    // 配置容器的参数, 第一种方式在CustomServletContainer配置

    // 也如下配置


    /*@Component
    static class CustomServletContainer implements EmbeddedServletContainerCustomizer {     //241.

        @Override
        public void customize(ConfigurableEmbeddedServletContainer container) {
            container.setPort(8888);
            container.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/404.html"));
            container.setSessionTimeout(10, TimeUnit.SECONDS);
        }
    }*/

    @Bean
    public EmbeddedServletContainerFactory servletContainerFactory() {
        TomcatEmbeddedServletContainerFactory factory = new TomcatEmbeddedServletContainerFactory();
        factory.setPort(8888);
        factory.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/404.html"));
        factory.setSessionTimeout(10, TimeUnit.SECONDS);
        return factory;
    }
}
