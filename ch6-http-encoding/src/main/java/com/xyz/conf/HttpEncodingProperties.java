package com.xyz.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.nio.charset.Charset;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 5/22/18
 * Time: 10:31 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@ConfigurationProperties(prefix = "spring.http.encoding")       //224. Properties读取配置文件中的值
public class HttpEncodingProperties {

    public static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");

    private Charset charset = DEFAULT_CHARSET;

    private boolean force = true;

    public Charset getCharset() {
        return charset;
    }

    public void setCharset(Charset charset) {
        this.charset = charset;
    }

    public boolean isForce() {
        return force;
    }

    public void setForce(boolean force) {
        this.force = force;
    }

    public static Charset getDefaultCharset() {
        return DEFAULT_CHARSET;
    }
}
