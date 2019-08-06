package com.example.demo.repository

import com.example.demo.domain.entity.User

interface UserRepository {

    fun findAllUsers(): List<User>

    fun createUser(id: Int, login: String, name: String): User
}