package com.example.demo.repository.impl

import com.example.demo.domain.entity.User
import com.example.demo.mapper.UserMapper
import com.example.demo.repository.UserRepository
import org.springframework.stereotype.Repository

@Repository
class UserRepositoryImpl(
    val userMapper: UserMapper
) : UserRepository {
    override fun findAllUsers(): List<User> {
        return userMapper.findAll()
    }
}