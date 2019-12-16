package cn.zhucogqi.mapper;

import cn.zhucogqi.base.BaseMapper;
import cn.zhucogqi.model.MallOrder;
import java.util.Date;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface MallOrderMapper extends BaseMapper<MallOrder> {
}