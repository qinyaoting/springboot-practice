package com.xyz.conf;

import com.xyz.service.FunctionService;
import com.xyz.service.UseFunctionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/13/18
 * Time: 10:09 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Configuration  // 4. 没有使用自动扫描
public class JavaConfig {   //配置类, 其中可以有0个或多个bean对象

    @Bean
    public FunctionService functionService() {
        return new FunctionService();
    }

    // 5. 可以在配置类中, 配置各个类的依赖关系;
    // 代替用@Service标注类, 在另一个类中用@Autowired来注入这个类了

    /*@Bean
    public UseFunctionService useFunctionService() {
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(functionService());
        return useFunctionService;
    }*/

    // 与上边的方法是同一个效果
    @Bean
    public UseFunctionService useFunctionService(FunctionService functionService) {
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(functionService());
        return useFunctionService;
    }
}
