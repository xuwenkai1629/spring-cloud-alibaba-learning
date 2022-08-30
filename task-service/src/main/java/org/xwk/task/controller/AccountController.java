package org.xwk.task.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xwk.task.model.po.User;
import org.xwk.task.service.AccountService;

import java.util.List;

/**
 * @author xu wen kai
 * @date 2022/08/30 16:38
 */
@RequestMapping("/account")
@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping("/findAll")
    public List<User> findUsers() {
        return accountService.findUsers();
    }

    @GetMapping("/findOne/{id}")
    public User findOne(@PathVariable String id) {
        return accountService.findUsers(id);
    }
}
