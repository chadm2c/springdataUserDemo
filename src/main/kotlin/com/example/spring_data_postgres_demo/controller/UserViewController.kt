package com.example.spring_data_postgres_demo.controller

import com.example.spring_data_postgres_demo.repository.UserRepository
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

@Controller
@RequestMapping("/users")
class UserViewController(private val userRepository: UserRepository) {

    @GetMapping
    fun getAllUsers(model: Model): String {
        val users = userRepository.findAll()
        model.addAttribute("users", users)
        return "list"
    }
}