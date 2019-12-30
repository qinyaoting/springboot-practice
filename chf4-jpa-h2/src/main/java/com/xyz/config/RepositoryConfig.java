package com.xyz.config;

import com.xyz.bean.Location;
import com.xyz.repository.LocationRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RepositoryConfig {

    @Bean
    InitializingBean saveData(LocationRepository repo){
        return ()->{
            repo.save(new Location((long) 1,"1",38.998064, 117.317267));
            repo.save(new Location((long)2,"2",38.997793, 117.317069));
            repo.save(new Location((long)3,"3",38.998006, 117.317101));
            repo.save(new Location((long)4,"4",38.997814, 117.317332));
        };
    }
}
