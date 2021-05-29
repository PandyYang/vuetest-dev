package com.dida.vuetestdev.service;

import com.dida.vuetestdev.entity.User;

import java.util.List;

/**
 * @author Pandy
 */
public interface UserService {
    List<User> findAll();
}
