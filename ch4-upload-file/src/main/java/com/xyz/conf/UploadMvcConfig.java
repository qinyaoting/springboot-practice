package com.xyz.conf;

import com.xyz.domain.MyMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/19/18
 * Time: 9:15 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.xyz")
public class UploadMvcConfig extends WebMvcConfigurerAdapter {

    @Bean
    public InternalResourceViewResolver internalResourceViewResolver() {
        InternalResourceViewResolver resolver =
                new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/classes/views/");
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);
        return resolver;
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index").setViewName("/index");
        registry.addViewController("/go2upload").setViewName("/upload");
        registry.addViewController("/convert").setViewName("/convert");
    }

    @Bean
    public MultipartResolver multipartResolver () {
        CommonsMultipartResolver resolver =
                new CommonsMultipartResolver();
        resolver.setMaxUploadSize(10*1000*1000);
        return resolver;
    }

    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(myMessageConverter());
    }

    @Bean
    public MyMessageConverter myMessageConverter() {
        return new MyMessageConverter();
    }
}
