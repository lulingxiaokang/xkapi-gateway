package com.llxk.xkapigateway;

import com.llxk.xkapi.provider.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class XkapiGatewayApplicationTests {

    @DubboReference
    private DemoService demoService;

    @Test
    void testRpc() {
        System.out.println(demoService.sayHello("world"));
    }

    @Test
    void contextLoads() {
    }

}
