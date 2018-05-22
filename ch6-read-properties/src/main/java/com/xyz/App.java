package com.xyz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 4/15/18
 * Time: 8:36 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@RestController
@SpringBootApplication
public class App {

    @Value("${book.author}")        //221. 通过@Value注解, 读取配置文件中的属性
    private String bookAuthor;

    @Value("${book.name}")
    private String bookName;

    @RequestMapping("/")
    String index() {
        return "book name is :" + bookName + " author:" + bookAuthor +"\n"+
                authorSettings.getName() + "--" + authorSettings.getAge();
    }

    @Autowired
    private AuthorSettings authorSettings;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
