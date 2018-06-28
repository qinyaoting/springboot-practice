package com.xyz.team;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.yaml.snakeyaml.Yaml;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 6/28/18
 * Time: 1:54 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Configuration
public class AppConf {

    private static Logger logger = LogManager.getLogger(AppConf.class);

    private final ObjectMapper mapper = new ObjectMapper();

    @Bean
    @ConditionalOnMissingBean(TeamProperties.class)
    public TeamProperties ff() throws IOException, IllegalAccessException {
        Object object = new Yaml().load(new ClassPathResource("conf/team.yml").getInputStream());
        String json = mapper.writeValueAsString(object);
        //logger.info("tasks parameter:{}", json);
        System.out.println(" ===" + json);
        TeamProperties res = mapper.readValue(json, TeamProperties.class);
        //autowireBean(res);
        return res;
    }
}
