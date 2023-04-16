package top.claws;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Task implements CommandLineRunner {
    @DubboReference
    HelloService helloService;

    @Override
    public void run(String... args) throws Exception {
        new Thread(() -> {
            while(true) {
                try {
                    Thread.sleep(1000);
                    System.out.println(helloService.sayHello("world"));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
