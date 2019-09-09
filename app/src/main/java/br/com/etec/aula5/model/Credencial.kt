package br.com.etec.aula5.model

import com.fasterxml.jackson.annotation.JsonProperty

data class Credencial (

    @JsonProperty("email")
    var email: String,

    @JsonProperty("password")
    var password : String
)