package com.xyz;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 4/15/18
 * Time: 8:49 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Component
@ConfigurationProperties(prefix = "author")     //222. 配置文件中有author.name author.age两个属性, 通过ConfigurationProperties自动装配到bean中
public class AuthorSettings {

    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
