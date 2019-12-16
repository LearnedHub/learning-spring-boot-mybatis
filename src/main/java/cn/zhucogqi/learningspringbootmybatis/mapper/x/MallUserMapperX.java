package cn.zhucogqi.learningspringbootmybatis.mapper.x;

import cn.zhucogqi.learningspringbootmybatis.base.BaseMapper;
import cn.zhucogqi.learningspringbootmybatis.mapper.MallUserMapper;
import cn.zhucogqi.learningspringbootmybatis.model.MallUser;

/**
 * @author ：Jobsz
 * @project ：learning-spring-boot-mybatis
 * @date ：Created in 2019/12/16 14:20
 * @description：
 * @modified By：
 * @version:
 */
public interface MallUserMapperX extends BaseMapper<MallUser> {

    MallUser getUser(Integer uid);
}
