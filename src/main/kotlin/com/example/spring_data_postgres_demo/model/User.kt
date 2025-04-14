package com.example.spring_data_postgres_demo.model
import jakarta.persistence.*

@Entity
@Table(name = "users")  // Explicit table name
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(nullable = false)
    val name: String,

    @Column(nullable = false, unique = true)
    val email: String
)