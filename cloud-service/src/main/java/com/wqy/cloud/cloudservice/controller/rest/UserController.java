package com.wqy.cloud.cloudservice.controller.rest;


import com.wqy.cloud.cloudservice.model.entity.User;
import com.wqy.cloud.cloudservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 用来将json/xml数据发送到前台页面，而不是返回视图页面
 * @author wqy
 * @version 1.0 2020/10/9
 *
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String sayHello() {
        return "hello";
    }

    @PostMapping(value = "/create", consumes = {"application/json"})
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping("/{id}/find")
    public User findById(@PathVariable(name = "id") String id) {
        return userService.findUserById(id);
    }

}
