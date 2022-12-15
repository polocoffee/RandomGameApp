package com.banklannister.randomgameapp.domain

import com.banklannister.randomgameapp.repo.GameRepository
import javax.inject.Inject

class GetGamesFromDatabase @Inject constructor(private val gameRepository: GameRepository) {

    suspend operator fun invoke(): List<GameItem> {

        return gameRepository.getGamesFromDatabase()

    }

}