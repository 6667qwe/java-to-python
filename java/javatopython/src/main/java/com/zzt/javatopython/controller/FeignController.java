package com.zzt.javatopython.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName FeignController
 * @Author zzt
 * @Date 2021/1/22
 * @Version 1.0
 * @Description TODO 服务端   ——响应客户端
 */
@Slf4j
@RestController
@RequestMapping("/feign")
public class FeignController {
    /**
     * 服务端方法
     * @param name
     * @return
     */
    @GetMapping("/demo1")
    public String getDemo1(@RequestParam String name) {
        log.info(name);
        return "success:" + name;
    }
}
