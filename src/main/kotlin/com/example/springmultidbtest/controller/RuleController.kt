package com.example.springmultidbtest.controller

import com.example.springmultidbtest.repository.remote.RuleRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author Jefferson Alves Reis (jefaokpta) < jefaokpta@hotmail.com >
 * Date: 09/07/23
 */
@RestController
@RequestMapping("/rules")
class RuleController(private val ruleRepository: RuleRepository) {

    @GetMapping
    fun getAll() = ruleRepository.findAll()

}