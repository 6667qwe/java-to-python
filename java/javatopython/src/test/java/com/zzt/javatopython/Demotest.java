package com.zzt.javatopython;


import com.zzt.javatopython.service.openFeign.DemoClient;
import feign.Feign;
import org.junit.jupiter.api.Test;

/**
 * @ClassName Demotest
 * @Author zzt
 * @Date 2021/1/22
 * @Version 1.0
 * @Description TODO
 */
public class Demotest {

    @Test
    public void DemoTest() {
        //绑定客户端接口
        DemoClient demoClient = Feign.builder().target(DemoClient.class, "http://localhost:8099");
        System.out.println("demoClient : " + demoClient);
        //调用客户端方法
        String result = demoClient.getDemo1("6667qwe");
        System.out.println(result);
    }

    @Test
    public void trst() {
        int a = 7202;
        int result = a / 50;
        if (a % 50 != 0) {
            result += 1;
        }
        System.out.println(result);
    }
}
