package com.sample.core.mapper

import com.sample.core.model.Shoes
import com.sample.database.entity.ShoesEntity
import com.sample.entrypoint.dto.ShoesDto
import kotlin.streams.toList


class ShoesConverter {
    companion object {
        fun shoesToShoesDto(shoes: Shoes) =
            ShoesDto(shoes.productId, shoes.price, shoes.shipping, shoes.type, shoes.color, shoes.size)

        fun shoesEntityToShoes(shoesEntity: ShoesEntity) =
            Shoes(shoesEntity.productId,
                shoesEntity.price,
                shoesEntity.shipping,
                shoesEntity.type,
                shoesEntity.color,
                shoesEntity.size)

        fun shoesToShoesEntity(shoes: Shoes) =
            ShoesEntity(shoes.productId, shoes.price, shoes.shipping, shoes.type, shoes.color, shoes.size)

        fun shoesDtoToShoes(shoesDto: ShoesDto) =
            Shoes(shoesDto.productId, shoesDto.price, shoesDto.shipping, shoesDto.type, shoesDto.color, shoesDto.size)

        fun listOfShoesToListOfShoesDto(shoes: List<Shoes>) =
            shoes.stream().map { sh ->
                ShoesDto(sh.productId, sh.price, sh.shipping, sh.type, sh.color, sh.size)
            }.toList()

        fun listOfShoesEntityToListOfShoes(shoes: List<ShoesEntity>) =
            shoes.stream().map { sh ->
                Shoes(sh.productId,
                    sh.price,
                    sh.shipping,
                    sh.type,
                    sh.color,
                    sh.size)
            }.toList()

        fun listOfShoesDtoToListOfShoes(shoesDto: List<ShoesDto>) =
            shoesDto.stream().map { shDto ->
                Shoes(shDto.productId, shDto.price, shDto.shipping, shDto.type, shDto.color, shDto.size)
            }.toList()

    }
}