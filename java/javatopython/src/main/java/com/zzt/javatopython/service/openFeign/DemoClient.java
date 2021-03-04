package com.zzt.javatopython.service.openFeign;

import feign.Param;
import feign.RequestLine;

/**
 * 客户端
 */
public interface DemoClient {
    /**
     * Feign书写客户端代码
     * @param name
     * @return
     */
    @RequestLine("GET /feign/demo1?name={name}")
    //@RequestLine
    //它只能标注在Method方法上。为请求定义HttpMethod和UriTemplate
    // （标注在方法上的就是一个HttpMethod，且写好了URI（可是绝对路径，也可是相对的，一般写后部分即可））。
    // 表达式、用大括号括起来的值{expression}最终会用对应的@Param注解填进去（根据key匹配）
    String getDemo1(@Param("name") String name);
}
