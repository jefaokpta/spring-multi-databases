package com.example.springmultidbtest.repository.local

import com.example.springmultidbtest.model.local.Person
import org.springframework.data.repository.CrudRepository

interface PersonRepository: CrudRepository<Person, Long> {
}