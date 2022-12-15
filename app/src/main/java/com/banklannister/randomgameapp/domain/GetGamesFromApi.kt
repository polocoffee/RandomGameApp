package com.banklannister.randomgameapp.domain

import com.banklannister.randomgameapp.data.local.toDatabase
import com.banklannister.randomgameapp.repo.GameRepository
import javax.inject.Inject


class GetGamesFromApi @Inject constructor(private val gameRepository: GameRepository) {

    suspend operator fun invoke(): List<GameItem> {

        val games = gameRepository.getGamesFromApi()

        if (games.isNotEmpty()) {
            gameRepository.deleteGames()
            gameRepository.insertGames(games.map { it.toDatabase() })
        }

        return games

    }

}