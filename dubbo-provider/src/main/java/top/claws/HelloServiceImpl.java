package top.claws;

import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class HelloServiceImpl implements HelloService{
    @Override
    public String sayHello(String name) {
        return "hello, " + name;
    }
}
