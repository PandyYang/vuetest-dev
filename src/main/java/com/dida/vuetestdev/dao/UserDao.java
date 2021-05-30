package com.dida.vuetestdev.dao;

import com.dida.vuetestdev.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Pandy
 */
@Mapper
public interface UserDao {

    // 查询所有用户信息
    List<User> findAll();

    void save(User user);
}
