package com.example.demo.mapper

import com.example.demo.domain.entity.User
import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Options
import org.apache.ibatis.annotations.Select

@Mapper // Marker to register it as MyBatis Mapper
interface UserMapper {

    @Select("SELECT * FROM users")
    fun findAll(): List<User>

    @Insert("INSERT INTO users (id, login, name) values (#{id}, #{login}, #{name})")
    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
    fun createUser(user: User): Int
}