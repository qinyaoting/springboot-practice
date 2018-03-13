package com.xyz.service;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/13/18
 * Time: 10:11 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
// 2. 没有用@Service
public class UseFunctionService {

    // 3. m没有用@Autowired注入functionService
    private FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String sayHello(String hello) {
        return functionService.sayHello(hello);
    }
}
