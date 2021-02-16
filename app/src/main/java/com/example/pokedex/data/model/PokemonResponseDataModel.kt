package com.example.pokedex.data.model

data class PokemonResponseDataModel(
    val pokemon: List<Pokemon>
)

data class Pokemon(
    val avg_spawns: Int,
    val candy: String,
    val candy_count: Int,
    val egg: String,
    val height: String,
    val id: Int,
    val img: String,
    val multipliers: List<Double>,
    val name: String,
    val next_evolution: List<NextEvolution>,
    val num: String,
    val prev_evolution: List<PrevEvolution>,
    val spawn_chance: Double,
    val spawn_time: String,
    val type: List<String>,
    val weaknesses: List<String>,
    val weight: String
)

data class NextEvolution(
    val name: String,
    val num: String
)

data class PrevEvolution(
    val name: String,
    val num: String
)