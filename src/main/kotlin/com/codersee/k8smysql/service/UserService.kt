package com.codersee.k8smysql.service

import com.codersee.k8smysql.model.User
import com.codersee.k8smysql.model.UserRequest
import com.codersee.k8smysql.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userRepository: UserRepository
) {

    fun saveUser(request: UserRequest): User =
        userRepository.save(
            User(
                name = request.name
            )
        )

    fun findAllUsers(): MutableIterable<User> =
        userRepository.findAll()
}