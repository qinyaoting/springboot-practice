package com.xyz;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;
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
@ConfigurationProperties(prefix = "group")
public class GroupProperties {   // 需要序列化, 不需要可以写成功

    public String name;
    public String logo;

    public List<Guy> guys;

    public GroupProperties(){}

    public GroupProperties(String logo, String name ) {
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

    public List<Guy> getGuys() {
        return guys;
    }

    public void setGuys(List<Guy> guys) {
        this.guys = guys;
    }

    @Override
    public String toString() {
        return "TeamProperties{" +
                "name='" + name + '\'' +
                ", logo='" + logo + '\'' +
                ", guys=" + guys +
                '}';
    }

    public static class Guy {

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
            return "Guy{" +
                    "name='" + name + '\'' +
                    ", gender='" + gender + '\'' +
                    '}';
        }
    }
}
