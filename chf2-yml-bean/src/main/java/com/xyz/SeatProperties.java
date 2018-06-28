package com.xyz;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 6/28/18
 * Time: 10:27 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Component
@ConfigurationProperties(prefix = "seat")
public class SeatProperties {

    public String name;
    public String logo;

    public Person person;

    public SeatProperties(){}

    public SeatProperties(String logo, String name ) {
        this.logo = logo;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "TeamProperties{" +
                "name='" + name + '\'' +
                ", logo='" + logo + '\'' +
                ", people=" + person +
                '}';
    }

    public static class Person {

        public String name;
        public String gender;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender='" + gender + '\'' +
                    '}';
        }
    }
}
