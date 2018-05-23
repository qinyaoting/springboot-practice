package com.xyz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 5/23/18
 * Time: 11:33 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Controller
@SpringBootApplication
public class Main {


    //TODO

    @RequestMapping("/")
    public String index(Model model) {
        Person p1 = new Person("tom", 23);
        List<Person> list = new ArrayList<Person>();
        list.add(new Person("xx",11));
        list.add(new Person("yy",22));
        list.add(new Person("zz",33));
        model.addAttribute("singlePerson", p1);
        model.addAttribute("people", list);
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
