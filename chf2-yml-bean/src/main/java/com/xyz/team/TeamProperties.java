package com.xyz.team;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 6/28/18
 * Time: 10:27 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
//@Component
//@ConfigurationProperties(prefix = "team")
public class TeamProperties extends AbsResource {

    public String name;
    public String logo;

    public List<AbsResource> resources;         //存放资源抽象类的集合

    public TeamProperties(){
        resources = Lists.newArrayList();
    }

    public TeamProperties(String logo, String name ) {
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

    public List<AbsResource> getResources() {
        return resources;
    }

    public void setResources(List<AbsResource> resources) {
        this.resources.addAll(resources);
    }

    @Override
    public String toString() {
        return "TeamProperties{" +
                "name='" + name + '\'' +
                ", logo='" + logo + '\'' +
                ", resources=" + resources +
                '}';
    }


}
