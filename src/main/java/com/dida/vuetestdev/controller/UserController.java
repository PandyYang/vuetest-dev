package com.dida.vuetestdev.controller;

import com.dida.vuetestdev.entity.User;
import com.dida.vuetestdev.service.UserService;
import com.dida.vuetestdev.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Pandy
 */
@RestController
@CrossOrigin
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("findAll")
    public List<User> findAll() {
        return userService.findAll();
    }

    @PostMapping("save")
    public Result save(@RequestBody User user) {
        Result result = new Result();
        try {
            userService.save(user);
            result.setMsg("保存成功");
        }catch (Exception e) {
            result.setStatus(false);
            result.setMsg("保存失败");
        }
        return result;
    }
}
