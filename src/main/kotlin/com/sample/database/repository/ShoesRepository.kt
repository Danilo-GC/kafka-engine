package com.sample.database.repository

import com.sample.database.entity.ShoesEntity
import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository

@Repository
interface ShoesRepository : CrudRepository<ShoesEntity, Int> {
    override fun findAll(): List<ShoesEntity>

}