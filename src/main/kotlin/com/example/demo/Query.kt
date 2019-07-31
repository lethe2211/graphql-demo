package com.example.demo

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component

@Component
class Query : GraphQLQueryResolver {

    fun getUsers(): List<User> {
        return listOf(
            User(id = 1, login = "hoge", name = "fuga") // Mock
        )
    }
}