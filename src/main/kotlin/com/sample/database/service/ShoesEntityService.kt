package com.sample.database.service

import com.sample.core.mapper.ShoesConverter
import com.sample.core.ports.ShoesRepositoryPort
import com.sample.database.repository.ShoesRepository
import javax.inject.Singleton

@Singleton
class ShoesEntityService(private val repository: ShoesRepository): ShoesRepositoryPort {
    override fun findProduct(productId: Int)=
        ShoesConverter.shoesEntityToShoes(repository.findById(productId).get())

    override fun findProductList() =
        ShoesConverter.listOfShoesEntityToListOfShoes(repository.findAll())


}