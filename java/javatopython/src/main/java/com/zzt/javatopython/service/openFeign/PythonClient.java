package com.zzt.javatopython.service.openFeign;

import feign.Headers;
import feign.RequestLine;

/**
 * python客户端，通过http调用Python的接口，执行Python的方法
 */
public interface PythonClient {

    @RequestLine("POST /analysisData")
    @Headers("Content-Type: application/json")//获取json数据
    String pythonAnalysisData();

    @RequestLine("POST /analysisData")
    @Headers("Content-Type: application/json")//获取json数据
    String pythonAnalysisData(String str);
}