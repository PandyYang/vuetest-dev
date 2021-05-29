package com.dida.vuetestdev.service.impl;

import com.dida.vuetestdev.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Pandy
 */
@SpringBootTest
class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    public void testFindAll() {
        userService.findAll().forEach(user -> System.out.println("user = " + user));
    }

}
