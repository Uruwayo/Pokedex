package com.example.pokedex.ui.fragment.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pokedex.data.model.Pokemon
import com.example.pokedex.data.network.PokemonRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ListViewModel : ViewModel() {

    private val _response: MutableLiveData<List<Pokemon>> by lazy {
        MutableLiveData<List<Pokemon>>()
    }
    val response: LiveData<List<Pokemon>> = _response


    fun requestInfo(){
        viewModelScope.launch(Dispatchers.IO) {
            val items = PokemonRepository().requestPokemonPictures()
            _response.postValue(items)

        }
    }
}