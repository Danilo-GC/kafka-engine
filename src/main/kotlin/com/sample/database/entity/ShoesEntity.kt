package com.sample.database.entity

import javax.persistence.Entity
import javax.persistence.GenerationType
import javax.persistence.Table
import javax.persistence.Id
import javax.persistence.GeneratedValue


@Entity
@Table(name = "shoes")
data class  ShoesEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val productId: Int = 0,
    val price: String = "",
    val shipping: Boolean = false,
    val type: String = "",
    val color: String = "",
    val size: Int = 0,
)
