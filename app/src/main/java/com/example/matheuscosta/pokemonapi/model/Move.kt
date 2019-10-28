package com.example.matheuscosta.pokemonapi.model

import com.google.gson.annotations.Expose

class Move(
        @Expose
        var name : String,
        @Expose
        var url : String){

        override fun toString(): String {
            return "Move(name='$name', url='$url')"
        }
}