package com.sample.core.ports

import com.sample.core.model.Shoes
import javax.inject.Singleton

@Singleton
interface ShoesRepositoryPort {

    fun findProduct(productId: Int): Shoes
    fun findProductList(): List<Shoes>

}