package cn.zhucogqi.controller;

import cn.zhucogqi.mapper.x.MallUserMapperX;
import cn.zhucogqi.model.MallUser;
import cn.zhucogqi.services.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ：Jobsz
 * @project ：learning-spring-boot-mybatis
 * @date ：Created in 2019/12/16 13:29
 * @description：
 * @modified By：
 * @version:
 */
@RestController
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/user/{userId}")
    public MallUser user(@PathVariable Integer userId) {
        MallUser user = userService.getUserById(userId);
        return user != null ? user : new MallUser();
    }

    @RequestMapping("/users")
    public List<MallUser> users() {
        return userService.getAllUsers();
    }

    @RequestMapping("/excp")
    public String excp() {
        throw new RuntimeException("测试失败");
    }

    @RequestMapping("/userx/{userId}")
    public MallUser userx(@PathVariable Integer userId) {
        MallUser user = userService.getUserById(userId);
        return user != null ? user : new MallUser();
    }
}
