package com.sample.entrypoint.controller

import com.sample.core.mapper.ShoesConverter
import com.sample.core.model.Shoes
import com.sample.core.ports.ShoesServicePort
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable

@Controller("/kafka/sample/shoes")
class ShoesController(private val service: ShoesServicePort) {

    @Get("/{productId}")
    fun findById(@PathVariable productId: Int): HttpResponse<Shoes> =
        HttpResponse.ok(ShoesConverter.shoesDtoToShoes(service.findById(productId)))

    @Get
    fun findList(): HttpResponse<List<Shoes>> =
        HttpResponse.ok(ShoesConverter.listOfShoesDtoToListOfShoes(service.findAll()))

}