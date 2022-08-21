package com.xuan.mapper;

import com.xuan.entity.UserEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    @Insert("INSERT into users values (null,#{userName},#{age});")
    int insertUser(@Param("userName") String userName,@Param("age") Integer age);

    @Select("SELECT id as id,name as username,age as age from users where id=#{id};")
    UserEntity selectByUserId(@Param("id") Integer id);

}
