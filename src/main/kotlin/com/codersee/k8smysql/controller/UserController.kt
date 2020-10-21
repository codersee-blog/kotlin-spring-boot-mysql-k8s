package com.codersee.k8smysql.controller

import com.codersee.k8smysql.model.User
import com.codersee.k8smysql.model.UserRequest
import com.codersee.k8smysql.service.UserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/user")
class UserController(
    private val userService: UserService
) {

    @PostMapping
    fun createUser(@RequestBody request: UserRequest): ResponseEntity<User> {
        val user = userService.saveUser(request)

        return ResponseEntity.ok(user)
    }

    @GetMapping
    fun findAllUsers(): ResponseEntity<MutableIterable<User>> {
        val users = userService.findAllUsers()

        return ResponseEntity.ok(users)
    }
}