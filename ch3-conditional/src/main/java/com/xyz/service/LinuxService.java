package com.xyz.service;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/16/18
 * Time: 3:28 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class LinuxService implements ListService {
    @Override
    public String showListCommand() {
        return "ls";
    }
}
