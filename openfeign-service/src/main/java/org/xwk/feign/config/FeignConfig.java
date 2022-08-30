package org.xwk.feign.config;


import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * feign日志
 *
 * @author xu wen kai
 * @date 2022/08/30 16:36
 */
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL; //设置日志级别为FULL
    }

}
