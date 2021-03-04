package com.zzt.javatopython;


import com.zzt.javatopython.service.openFeign.PythonClient;
import feign.Feign;
import org.junit.jupiter.api.Test;

/**
 * @ClassName Test
 * @Author zzt
 * @Date 2021/3/1
 * @Version 1.0
 * @Description TODO
 */
//@SpringBootTest
public class TestPython {
    @Test
    public void pythonTest(){
        //绑定客户端接口
        PythonClient pythonClient = Feign.builder().target(PythonClient.class,"http://localhost:5000");
        System.out.println("pythonClient : " + pythonClient);
        //调用客户端方法
        String result = pythonClient.pythonAnalysisData();
        System.out.println("result1:"+result);

        String result2 = pythonClient.pythonAnalysisData("java");
        System.out.println("result2:"+result2);
    }
}
