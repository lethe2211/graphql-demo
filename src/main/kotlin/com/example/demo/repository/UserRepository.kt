package com.example.demo.repository

import com.example.demo.domain.entity.User

interface UserRepository {

    fun findAllUsers(): List<User>
}