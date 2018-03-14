package com.xyz.prepost;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/14/18
 * Time: 10:03 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class BeanWayService {

    public void init() {
        System.out.println("BeanWayService init");
    }

    public BeanWayService(){
        super();
        System.out.println("BeanWayService construct");
    }

    public void destroy(){
        System.out.println("BeanWayService destroy");
    }
}
