package com.example.pokedex.ui.fragment.list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ListViewModel : ViewModel() {

    fun requestInfo(){
        viewModelScope.launch(Dispatchers.IO) {

        }
    }
}