package com.sample.core.service

import com.sample.core.mapper.ShoesConverter
import com.sample.core.ports.ShoesRepositoryPort
import com.sample.core.ports.ShoesServicePort
import javax.inject.Singleton

@Singleton
class ShoesService(private val repository: ShoesRepositoryPort) : ShoesServicePort {

    override fun findById(productId: Int) =
        ShoesConverter.shoesToShoesDto(repository.findProduct(productId))

    override fun findAll() =
        ShoesConverter.listOfShoesToListOfShoesDto(repository.findProductList())
}
