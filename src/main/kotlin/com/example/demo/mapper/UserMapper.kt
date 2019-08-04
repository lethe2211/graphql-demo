package com.example.demo.mapper

import com.example.demo.domain.entity.User
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select

@Mapper
interface UserMapper {

    @Select("SELECT * FROM users")
    fun findAll(): List<User>
}