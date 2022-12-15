package com.banklannister.randomgameapp.domain

import com.banklannister.randomgameapp.data.local.GameEntity
import com.banklannister.randomgameapp.data.remote.GameModel

data class GameItem(

    val id: Int?,
    val title: String?,
    val thumbnail: String?,
    val short_description: String?,
    val game_url: String?

)

fun GameModel.toDomain() = GameItem(id = id, title = title, thumbnail = thumbnail, short_description = short_description, game_url = game_url)
fun GameEntity.toDomain() = GameItem(id = id, title = title, thumbnail = thumbnail, short_description = short_description, game_url = game_url)

