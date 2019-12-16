package cn.zhucogqi.controller;

import cn.zhucogqi.mapper.x.MallUserMapperX;
import cn.zhucogqi.model.MallUser;
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

    private MallUserMapperX mallUserMapper;

    public UserController(MallUserMapperX mallUserMapper) {
        this.mallUserMapper = mallUserMapper;
    }

    @RequestMapping("/user/{userId}")
    public MallUser user(@PathVariable Integer userId) {
        MallUser user = mallUserMapper.selectByPrimaryKey(userId);
        return user != null ? user : new MallUser();
    }

    @RequestMapping("/users")
    public List<MallUser> users() {
        return mallUserMapper.selectAll();
    }

    @RequestMapping("/excp")
    public String excp() {
        throw new RuntimeException("测试失败");
    }

    @RequestMapping("/userx/{userId}")
    public MallUser userx(@PathVariable Integer userId) {
        MallUser user = mallUserMapper.getUser(userId);
        return user != null ? user : new MallUser();
    }
}
