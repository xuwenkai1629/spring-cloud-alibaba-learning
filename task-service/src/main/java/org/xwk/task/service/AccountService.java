package org.xwk.task.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.xwk.task.model.po.User;

import java.util.List;

/**
 * @author xu wen kai
 * @date 2022/08/30 16:39
 */
@Component
@FeignClient("openfeign-service")
public interface AccountService {
    @GetMapping(value = "/user/findUsers")
    List<User> findUsers();

    @GetMapping(value = "/user/findUsers/{id}")
    User findUsers(@PathVariable String id);
}
