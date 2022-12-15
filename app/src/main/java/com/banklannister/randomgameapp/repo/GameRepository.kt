package com.banklannister.randomgameapp.repo

import com.banklannister.randomgameapp.data.local.GameDao
import com.banklannister.randomgameapp.data.local.GameEntity
import com.banklannister.randomgameapp.data.remote.GameService
import com.banklannister.randomgameapp.domain.GameItem
import com.banklannister.randomgameapp.domain.toDomain
import javax.inject.Inject


class GameRepository @Inject constructor(
    private val gameService: GameService,
    private val gameDao: GameDao
) {

    suspend fun getGamesFromApi(): List<GameItem> {

        val games = gameService.getGames()
        return games.map { it.toDomain() }

    }

    suspend fun getGamesFromDatabase(): List<GameItem> {

        val games = gameDao.getGames()
        return games.map { it.toDomain() }

    }

    suspend fun insertGames(games: List<GameEntity>) {
        gameDao.insertGames(games)
    }

    suspend fun deleteGames() {
        gameDao.deleteGames()
    }

}
