package com.example.springmultidbtest.controller

import com.example.springmultidbtest.repository.PersonRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author Jefferson Alves Reis (jefaokpta) < jefaokpta@hotmail.com >
 * Date: 09/07/23
 */
@RestController
@RequestMapping("/persons")
class PersonController(private val personRepository: PersonRepository) {

    @GetMapping
    fun getAll() = personRepository.findAll()
}