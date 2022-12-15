package com.banklannister.randomgameapp.data.remote

import com.banklannister.randomgameapp.util.Constants.Companion.GAMES
import retrofit2.Response
import retrofit2.http.GET

interface GameApi {

    @GET(GAMES)
    suspend fun getGames(): Response<List<GameModel>>

}