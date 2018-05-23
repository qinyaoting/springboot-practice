package com.xyz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.context.web.OrderedCharacterEncodingFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 5/22/18
 * Time: 10:30 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Configuration
@EnableConfigurationProperties(HttpEncodingProperties.class)    //225. HttpEncodingProperties
@ConditionalOnClass(CharacterEncodingFilter.class)  //当类路径下有指定的类的条件下
@ConditionalOnProperty(prefix = "spring.http.encoding", value = "enable", matchIfMissing = true)    //226.属性文件中是否有指定的值
public class HttpEncodingConfiguration {

    @Autowired
    private HttpEncodingProperties properties;


    @Bean
    @ConditionalOnMissingBean(CharacterEncodingFilter.class)    //227.如果容器中没有bean就会初始化下边的对象
    public CharacterEncodingFilter  characterEncodingFilter() {
        CharacterEncodingFilter filter = new OrderedCharacterEncodingFilter();
        filter.setEncoding(this.properties.getCharset().name());
        filter.setForceEncoding(this.properties.isForce());
        return filter;
    }
}
