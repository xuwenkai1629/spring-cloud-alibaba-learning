package org.example.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 123
 *
 * @author xu wen kai
 * @date 2022/07/15 12:02
 */
@FeignClient(value = "${spring.application.name}")
public interface UserService {
    @GetMapping(value = "/echo/{str}")
    String echo(@PathVariable("str") String str);
}
