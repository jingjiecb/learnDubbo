package top.claws.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.claws.HelloService;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @DubboReference
    HelloService helloService;

    @GetMapping
    public String hello(@RequestParam String name) {
        return helloService.sayHello(name);
    }
}
