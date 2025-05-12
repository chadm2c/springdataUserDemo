package com.example.spring_data_postgres_demo.controller

import com.example.spring_data_postgres_demo.model.User
import com.example.spring_data_postgres_demo.repository.UserRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/users")
class UserController(private val userRepository: UserRepository) {

    @GetMapping
    fun getAllUsers(): List<User> = userRepository.findAll()

    @PostMapping
    fun createUser(@RequestBody user: User): User = userRepository.save(user)

    @GetMapping("/{email}")
    fun getUserByEmail(@PathVariable email: String): User? =
        userRepository.findByEmail(email)
}
