package com.xyz.domain;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/19/18
 * Time: 9:36 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class DemoObj {

    private long id;
    private String name;

    public DemoObj(long id) {
        this.id = id;
    }

    public DemoObj(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public DemoObj() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DemoObj{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
