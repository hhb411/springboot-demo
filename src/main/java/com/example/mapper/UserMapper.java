package com.example.mapper;

import com.example.domain.UserDomain;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by Administrator on 2018/8/18.
 */
//@Mapper
public interface UserMapper {

    @Select("SELECT * FROM users")
    @Results({
            @Result(property = "userSex",  column = "user_sex"),
            @Result(property = "nickName", column = "nick_name")
    })
    List<UserDomain> getAll();

    @Select("SELECT * FROM users WHERE id = #{id}")
    @Results({
            @Result(property = "userSex",  column = "user_sex"),
            @Result(property = "nickName", column = "nick_name")
    })
    UserDomain getOne(Long id);

    @Insert("INSERT INTO users(userName,passWord,user_sex) VALUES(#{userName}, #{passWord}, #{userSex})")
    void insert(UserDomain user);

    @Update("UPDATE users SET userName=#{userName}, password=#{password}, nick_name=#{nickName} WHERE id =#{id}")
    void update(UserDomain user);

    @Delete("DELETE FROM users WHERE id =#{id}")
    void delete(Long id);

}
