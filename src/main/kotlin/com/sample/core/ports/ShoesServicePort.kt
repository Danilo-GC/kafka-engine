package com.sample.core.ports

import com.sample.entrypoint.dto.ShoesDto
import javax.inject.Singleton

@Singleton
interface ShoesServicePort {

    fun findById(productId: Int): ShoesDto
    fun findAll(): List<ShoesDto>
}