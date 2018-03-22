package com.xyz.service;

import com.xyz.conf.BeanConfig;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/22/18
 * Time: 2:11 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {BeanConfig.class})
@WebAppConfiguration("src/main/resource")
public class DemoServiceTest {

    MockMvc mockMvc;

    /*@Autowired
    private DemoService demoService;*/

    @Autowired
    WebApplicationContext context;

    @Autowired
    MockHttpSession session;

    @Autowired
    MockHttpServletRequest request;

    @Before
    public void setup() {
        this.mockMvc =
                MockMvcBuilders.webAppContextSetup(this.context).build();
    }

    @Test
    public void testNormalController() throws Exception {
        mockMvc.perform(get("/normal"))
                .andExpect(status().isOk())
                .andExpect(view().name("page"));

    }

    @Autowired
    DemoService demoService;

    @Test
    public void testRest() throws Exception {
        mockMvc.perform(get("/testrest"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("text/plain;charset=utf-8"))
                .andExpect(content().string(demoService.saySomething()));
    }
}
