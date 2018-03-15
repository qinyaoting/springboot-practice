package com.xyz.service;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import sun.misc.IOUtils;
import sun.nio.ch.IOUtil;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/15/18
 * Time: 8:18 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {

    private String beanName;
    private ResourceLoader resourceLoader;

    @Override
    public void setBeanName(String s) {
        this.beanName = s;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public void outputResource() throws IOException {
        System.out.println(beanName);
        Resource mResource = resourceLoader.getResource("classpath:com/xyz/test.txt");
        System.out.println(org.apache.commons.io.IOUtils.toString(mResource.getInputStream()));
    }
}
