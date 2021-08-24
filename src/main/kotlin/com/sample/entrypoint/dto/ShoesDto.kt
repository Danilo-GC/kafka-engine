package com.sample.entrypoint.dto

data class ShoesDto(
    val productId: Int = 0,
    val price: String = "",
    val shipping: Boolean = false,
    val type: String = "",
    val color: String = "",
    val size: Int = 0,
)
