package com.wyq.ssm.dao;

import com.wyq.ssm.pojo.User;
import org.apache.ibatis.annotations.Select;


public interface UserMapper {

    @Select("select * from user where id = #{id}")
    public User findById(int id);
}
