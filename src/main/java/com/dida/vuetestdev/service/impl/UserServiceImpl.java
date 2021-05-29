package com.dida.vuetestdev.service.impl;

import com.dida.vuetestdev.dao.UserDao;
import com.dida.vuetestdev.entity.User;
import com.dida.vuetestdev.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author Pandy
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
