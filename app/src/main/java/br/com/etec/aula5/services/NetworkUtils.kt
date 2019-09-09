package br.com.etec.aula5.services

import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory

class NetworkUtils {
    companion object {

        /**
         * Retorna a instância do client Retrofit para futuras requisições
         */
        fun getRetrofitInstance(): Retrofit {
            return Retrofit.Builder().baseUrl("http://httbin.org")
                .addConverterFactory(JacksonConverterFactory.create()).build()
        }
    }
}