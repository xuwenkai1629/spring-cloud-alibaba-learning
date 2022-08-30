package com.nacos.provider.controller;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * 123
 *
 * @author xu wen kai
 * @date 2022/07/08 17:33
 */
@ConfigurationProperties(prefix = "ssd.test")
@Component
public class NacosTestInfo {
    private String username;
    private String password;
    private String url;
    private String port;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public NacosTestInfo(String username, String password, String url, String port) {
        this.username = username;
        this.password = password;
        this.url = url;
        this.port = port;
    }

    public NacosTestInfo() {
    }
}
