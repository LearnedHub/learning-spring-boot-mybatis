package cn.zhucogqi.services;

import cn.zhucogqi.mapper.x.MallUserMapperX;
import cn.zhucogqi.model.MallUser;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：Jobsz
 * @project ：learning-spring-boot-mybatis
 * @date ：Created in 2019/12/16 16:09
 * @description：
 * @modified By：
 * @version:
 */
@Service
public class UserService {

    private MallUserMapperX mallUserMapper;

    public UserService(MallUserMapperX mallUserMapper) {
        this.mallUserMapper = mallUserMapper;
    }

    public MallUser getUserById(Integer id) {
        return mallUserMapper.selectByPrimaryKey(id);
    }

    public List<MallUser> getAllUsers() {
        return mallUserMapper.selectAll();
    }
}
