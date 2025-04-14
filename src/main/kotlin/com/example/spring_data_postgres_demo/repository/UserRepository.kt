package com.example.spring_data_postgres_demo.repository


import com.example.spring_data_postgres_demo.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long> {
    fun findByEmail(email: String): User?
}