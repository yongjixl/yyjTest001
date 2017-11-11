package com.yuan.test.mapper;
import com.yuan.test.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository(value="userMapper")
public interface UserMapper {
    User findByName(String name);
}
