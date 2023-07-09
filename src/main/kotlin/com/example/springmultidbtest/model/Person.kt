package com.example.springmultidbtest.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("PERSONS")
class Person(
    @Id
    val id: Long,
    val name: String,
    val age: Int
) {
}