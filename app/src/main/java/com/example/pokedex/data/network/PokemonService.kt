package com.example.pokedex.data.network

import com.example.pokedex.data.model.PokemonResponseDataModel
import retrofit2.Call
import retrofit2.http.GET


//https://raw.githubusercontent.com/Biuni/PokemonGO-Pokedex/master/pokedex.json
interface PokemonService {

    @GET("Biuni/PokemonGO-Pokedex/master/pokedex.json")
    fun getPokeImages(): Call<PokemonResponseDataModel>

}
