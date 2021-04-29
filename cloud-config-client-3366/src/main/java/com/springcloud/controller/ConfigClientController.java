package com.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${server.port}")
    private String serverPort;

    @Value("${server.info}")
    private String serverInfo;

    @GetMapping("/configInfo")
    public String configInfo(){
        return "serverPort:"+serverPort+"\t serverInfo:"+serverInfo;
    }

}
