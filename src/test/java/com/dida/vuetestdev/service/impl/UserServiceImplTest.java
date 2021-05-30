package com.dida.vuetestdev.service.impl;

import com.dida.vuetestdev.entity.User;
import com.dida.vuetestdev.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

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

    @Test
    public void save() {
        User user = new User();
        user.setName("云").setBir(new Date()).setSex("girl").setAddress("陕西");
        userService.save(user);
    }

}
