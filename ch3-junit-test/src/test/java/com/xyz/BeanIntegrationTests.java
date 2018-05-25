package com.xyz;

import com.xyz.bean.TestBean;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/16/18
 * Time: 6:12 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {BeanConfig.class})
@ActiveProfiles("dev")
public class BeanIntegrationTests {

    @Autowired
    private TestBean testBean;

    @Test
    public void prodInject() {
        String expected = "dev";
        String actual = testBean.getContent();
        Assert.assertEquals(expected, actual);
    }
}
