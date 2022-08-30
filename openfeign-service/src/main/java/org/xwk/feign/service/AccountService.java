package org.xwk.feign.service;


import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.xwk.feign.model.po.User;

import java.util.List;

/**
 * 账户服务
 *
 * @author xu wen kai
 * @date 2022/08/30 10:21
 */
public interface AccountService {
    @GetMapping(value = "/user/findUsers")
    List<User> findUsers();

    @GetMapping(value = "/user/findUsers/{id}")
    User findOne(@PathVariable String id);
}
