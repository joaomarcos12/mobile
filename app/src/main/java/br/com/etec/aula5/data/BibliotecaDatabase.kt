package br.com.etec.aula5.data

import androidx.room.Database
import androidx.room.RoomDatabase
import br.com.etec.aula5.model.Usuario

import android.content.Context
import androidx.room.Room

@Database(entities = [(Usuario::class)],version = 1)
abstract class BibliotecaDatabase:RoomDatabase(){

    abstract fun UsuarioDao():UsuarioDao

    companion object{
        private  var INSTANCE: BibliotecaDatabase? = null
        fun getInstance(context: Context): BibliotecaDatabase?{
            if (INSTANCE == null){
                synchronized(BibliotecaDatabase::class){
                    INSTANCE = Room.databaseBuilder(context.applicationContext, BibliotecaDatabase::class.java, "biblioteca.db").build()
                }
            }
            return INSTANCE
        }
    }
}