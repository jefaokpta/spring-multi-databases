package com.example.springmultidbtest.repository.remote

import com.example.springmultidbtest.model.remote.Rule
import org.springframework.data.repository.CrudRepository

/**
 * @author Jefferson Alves Reis (jefaokpta) < jefaokpta@hotmail.com >
 * Date: 09/07/23
 */
interface RuleRepository: CrudRepository<Rule, Long> {
}