package life.sun.community.community.mapper;

import life.sun.community.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface UserMapper {
    /**
     * 插入user数据
     * @param user
     */
    @Insert("insert into user(name,account_id,token,gmt_create,gmt_modified) values(#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified})")
    void inser(User user);

    @Select("select * from user where token= #{token}")
    User findByToken(String token);
}
