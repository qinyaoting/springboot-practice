package com.xyz.aop;

import java.lang.annotation.*;

/**
 * Created by chin on 3/13/18.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {

    String name();
}
