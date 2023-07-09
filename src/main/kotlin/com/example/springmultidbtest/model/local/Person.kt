package com.example.springmultidbtest.model.local

import jakarta.persistence.*

@Entity
@Table(name = "PERSONS")
data class Person(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val name: String? = null,
    val age: Int? = null,
) {
}