package com.example.demo.repository.impl

import com.example.demo.domain.entity.User
import com.example.demo.mapper.UserMapper
import com.example.demo.repository.UserRepository
import org.springframework.stereotype.Repository

@Repository
class UserRepositoryImpl(
    private val userMapper: UserMapper
) : UserRepository {
    override fun findAllUsers(): List<User> {
        return userMapper.findAll()
    }

    override fun createUser(id: Int, login: String, name: String): User {
        val user = User(
            id = id,
            login = login,
            name = name
        )
        userMapper.createUser(user)
        return user
    }
}