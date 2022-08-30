package org.xwk.feign.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AccountServiceTest {
    @Autowired
    private AccountService accountService;
    @Test
    public void findUsers() {
        accountService.findUsers();
    }

}