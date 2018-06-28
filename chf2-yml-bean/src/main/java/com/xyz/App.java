package com.xyz;

import com.xyz.team.TeamProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 6/28/18
 * Time: 10:10 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@RestController
@SpringBootApplication
public class App {

    @Autowired
    private PersonProperties person;  // 简单的yml转java对象

    @Autowired
    private SeatProperties seat;        // 工位中包括员工的信息

    @Autowired
    private GroupProperties group;        // team包含列表,列表中是员工

    @Autowired
    private TeamProperties team;        // 如何用yaml数据转为抽象对象的列表

    @RequestMapping("/")
    String index() {
        // return seat.toString();
        // return group.toString();
        return team.toString();
    }

    public static void main(String[] args) throws IOException {
        SpringApplication.run(App.class, args);

    }
}
