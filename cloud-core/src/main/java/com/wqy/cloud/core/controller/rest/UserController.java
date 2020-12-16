package com.wqy.cloud.core.controller.rest;


import com.wqy.cloud.core.model.entity.User;
import com.wqy.cloud.core.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 用来将json/xml数据发送到前台页面，而不是返回视图页面
 *
 * @author wqy
 * @version 1.0 2020/10/9
 */

@Api(tags = {"用户Controller"})
@RestController
@RequestMapping("/rest/users")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 新增用户
     *
     * @param user 用户实体
     * @return 新增的用户
     */
    @ApiOperation(value = "新增用户")
    @PostMapping(value = "/create", consumes = {"application/json"})
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    /**
     * 通过id查找用户
     *
     * @param id 用户id
     * @return 查找到的用户
     */
    @ApiOperation(value = "通过id查找用户")
    @GetMapping("/{id}")
    public User findById(@PathVariable(name = "id") String id) {
        return userService.findUserById(id);
    }

    /**
     * 通过name查找用户
     *
     * @param name 用户name
     * @return 查找到的用户
     */
    @ApiOperation(value = "通过name查找用户")
    @PostMapping("/{name}")
    public User findByName(@PathVariable(name = "name") String name) {
        return userService.findUserByName(name);
    }

}
