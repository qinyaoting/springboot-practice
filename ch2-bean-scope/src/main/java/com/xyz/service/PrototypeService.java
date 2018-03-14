package com.xyz.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/14/18
 * Time: 8:55 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */

@Service
@Scope("prototype")     //2.表示该类, 每次创建新对象
public class PrototypeService {
}
