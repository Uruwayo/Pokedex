package com.example.pokedex.data.network

import com.example.pokedex.data.model.PokemonResponseDataModel
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class PokemonNetwork {

    lateinit var service: PokemonService

    private fun loadRetrofit(){
        val retrofit = Retrofit.Builder()
            .baseUrl("https://raw.githubusercontent.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        service = retrofit.create(PokemonService::class.java)
    }

    fun requestPokemonImages(): PokemonResponseDataModel{
        loadRetrofit()
        val repos: Call<PokemonResponseDataModel> = service.getPokeImages()
        return repos.execute().body() ?: throw ApiException()
    }

}

class ApiException() : Exception()
