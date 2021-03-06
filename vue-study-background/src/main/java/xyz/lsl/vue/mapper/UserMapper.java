package xyz.lsl.vue.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import xyz.lsl.vue.common.vo.userVo.UserListVo;
import xyz.lsl.vue.entity.User;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author YIQU
 * @since 2022-03-18 13:13:49
 */
public interface UserMapper extends BaseMapper<User> {

    /*根据用户名查询用户*/
    List<UserListVo> getUserListByUsername(@Param("username") String username);
}
