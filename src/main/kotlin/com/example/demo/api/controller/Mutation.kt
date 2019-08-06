package com.example.demo.api.controller

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import com.example.demo.domain.entity.User
import com.example.demo.service.UserService
import org.springframework.stereotype.Component

@Component
class Mutation(
    private val userService: UserService
) : GraphQLMutationResolver {

    fun writeUser(id: Int, login: String, name: String): User {
        return userService.createUser(id, login, name)
    }
}