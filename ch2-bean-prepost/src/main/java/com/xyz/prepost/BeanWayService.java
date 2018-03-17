package com.xyz.prepost;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/14/18
 * Time: 10:03 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class BeanWayService {   // 普通java类, 没有@Service进行标注, 方法也是普通方法

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
