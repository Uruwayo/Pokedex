package com.example.pokedex.data.network

import com.example.pokedex.data.model.Pokemon

class PokemonRepository {

    fun requestPokemonPictures(): List<Pokemon>{
        return PokemonNetwork().requestPokemonImages().pokemon
    }
}
