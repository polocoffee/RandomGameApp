package com.banklannister.randomgameapp.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.banklannister.randomgameapp.domain.GameItem


@Entity(tableName = "game_table")
data class GameEntity(

    @PrimaryKey
    val id: Int?,
    val title: String?,
    val thumbnail: String?,
    val short_description: String?,
    val game_url: String?

)

fun GameItem.toDatabase() = GameEntity(
    id = id, title = title, thumbnail = thumbnail, short_description = short_description, game_url = game_url)