package com.nacos.provider.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xu wen kai
 * @date 2022/07/08 16:12
 */
@RestController
@RequestMapping("/provide/")
@Slf4j
@RefreshScope
public class ProviderController {

    @Value("${ssd.test.username}")
    private String username;
    @Value("${server.port}")
    private String port;
    @Autowired
    private NacosTestInfo nacosTestInfo;

    @GetMapping("/sayHello/{name}")
    public String sayHello(@PathVariable("name") String name){
        log.info("I'm calling nacos-provider service by dynamic gateway...");
        return name + " Hi~, I'm from nacos-provider";
    }

    @GetMapping(value = "/get")
    public Object getConfig(){
        System.out.println(username);
        System.out.println(nacosTestInfo);
        return nacosTestInfo;
    }
}
