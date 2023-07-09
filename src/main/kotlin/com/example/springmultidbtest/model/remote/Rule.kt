package com.example.springmultidbtest.model.remote

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

/**
 * @author Jefferson Alves Reis (jefaokpta) < jefaokpta@hotmail.com >
 * Date: 09/07/23
 */
@Entity
@Table(name = "rules")
data class Rule(
    @Id
    val id: Long? = null,
    val name: String? = null,
) {
}