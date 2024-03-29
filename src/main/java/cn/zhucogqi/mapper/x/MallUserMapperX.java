package cn.zhucogqi.mapper.x;

import cn.zhucogqi.base.BaseMapper;
import cn.zhucogqi.domain.MallUser;
import org.apache.ibatis.annotations.Param;

/**
 * @author ：Jobsz
 * @project ：learning-spring-boot-mybatis
 * @date ：Created in 2019/12/16 14:20
 * @description：
 * @modified By：
 * @version:
 */
public interface MallUserMapperX extends BaseMapper<MallUser> {

    MallUser getUser(@Param("uid") Integer uid);
}
