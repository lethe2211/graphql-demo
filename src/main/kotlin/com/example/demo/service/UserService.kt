package com.example.demo.service

import com.example.demo.domain.entity.User

interface UserService {

    fun findAllUsers(): List<User>

    fun createUser(id: Int, login: String, name: String): User
}