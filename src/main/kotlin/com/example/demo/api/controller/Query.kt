package com.example.demo.api.controller

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.example.demo.domain.entity.User
import com.example.demo.service.UserService
import org.springframework.stereotype.Component

@Component
class Query(
    val userService: UserService
) : GraphQLQueryResolver {

    fun getUsers(): List<User> {
        return userService.findAllUsers()
    }
}