package com.xyz.conf;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.beans.factory.config.PropertyResourceConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/14/18
 * Time: 9:32 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Configuration
@ComponentScan("com.xyz")
@PropertySource(value = "classpath:/test.properties",ignoreResourceNotFound = true)
public class ELConfig {

    @Value("I love u!")
    private String normal;      //固定

    @Value("#{systemProperties['os.name']}")    //读取系统信息,
    private String osName;

    @Value("#{systemProperties}")    //读取系统
    private Properties systemProperties;

    @Value("#{T(java.lang.Math).random() * 100.0}")     //调用jdk中的方法
    private double randomNum;

    @Value("#{demoService.another}")    //其他的类中的属性
    private String fromAnother;

    @Value("classpath:/test.txt")       //读取文件
    private Resource testFile;

    @Value("http://www.baidu.com")      //读取网络资源
    private Resource testUrl;


    @Value("${book.name}")              //读取配置文件中的值
    private String bookName;

    @Autowired
    private Environment environment;

    public void outputResource() {
        try {
            System.out.println(normal);
            System.out.println(osName);
            System.out.println("System Properties total:" + systemProperties.size());
            //systemProperties.forEach((k,v) -> System.out.println("---" + k + ":" + v));
            Map<String, String> map = new TreeMap<String, String>((Map) systemProperties);
            map.forEach((k,v) -> System.out.println("---" +k + ':' + v));
            System.out.println(randomNum);
            System.out.println(fromAnother);
            System.out.println(IOUtils.toString(testFile.getInputStream()));
            System.out.println(IOUtils.toString(testUrl.getInputStream()));
            System.out.println(bookName);
            System.out.println(environment.getProperty("book.author"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String getNormal() {
        return normal;
    }

    public void setNormal(String normal) {
        this.normal = normal;
    }

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public double getRandomNum() {
        return randomNum;
    }

    public void setRandomNum(double randomNum) {
        this.randomNum = randomNum;
    }

    public String getFromAnother() {
        return fromAnother;
    }

    public void setFromAnother(String fromAnother) {
        this.fromAnother = fromAnother;
    }

    public Resource getTestFile() {
        return testFile;
    }

    public void setTestFile(Resource testFile) {
        this.testFile = testFile;
    }

    public Resource getTestUrl() {
        return testUrl;
    }

    public void setTestUrl(Resource testUrl) {
        this.testUrl = testUrl;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
