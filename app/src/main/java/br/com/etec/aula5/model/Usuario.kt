package br.com.etec.aula5.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import br.com.etec.aula5.model.Usuario.Companion.TABLE_NAME

@Entity(tableName = TABLE_NAME)
data class Usuario(
    @PrimaryKey(autoGenerate = true)
    var id: Long?,
    @ColumnInfo(name = COLUMN_NAME)
    var name: String,
    @ColumnInfo(name = COLUMN_EMAIL)
    var email: String,
    @ColumnInfo(name = COLUMN_FONE)
    var phone: String,
    @ColumnInfo(name = COLUMN_PASSWD)
    var password: String
) {


    companion object {
        const val TABLE_NAME = "usuarios"
        const val COLUMN_NAME = "nome"
        const val COLUMN_EMAIL = "email"
        const val COLUMN_FONE = "telefone"
        const val COLUMN_PASSWD = "senha"
    }


}