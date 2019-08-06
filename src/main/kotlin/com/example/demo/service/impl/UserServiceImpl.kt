package com.example.demo.service.impl

import com.example.demo.domain.entity.User
import com.example.demo.repository.UserRepository
import com.example.demo.service.UserService
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(
    private val userRepository: UserRepository
) : UserService {
    override fun findAllUsers(): List<User> {
        return userRepository.findAllUsers()
    }

    override fun createUser(id: Int, login: String, name: String): User {
        return userRepository.createUser(id, login, name)
    }
}