package br.com.etec.aula5.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import br.com.etec.aula5.model.Usuario

@Dao
interface UsuarioDao{
    @Query("select * from"+Usuario.TABLE_NAME)
    fun getAll():List<Usuario>

    @Insert(onConflict = REPLACE)
    fun insert(usuario: Usuario):Usuario

    
    fun delete(id: Long)

    fun get(id: Long):Usuario

}