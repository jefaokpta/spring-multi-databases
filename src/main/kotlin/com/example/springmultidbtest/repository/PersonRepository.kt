package com.example.springmultidbtest.repository

import com.example.springmultidbtest.model.Person
import org.springframework.data.repository.CrudRepository

interface PersonRepository: CrudRepository<Person, Long>{
}