package br.com.etec.aula5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class RegisterActivity : AppCompatActivity() {

    lateinit var txtNome:TextInputEditText
    lateinit var txtEmail:TextInputEditText
    lateinit var txtTelefone:TextInputEditText
    lateinit var txtSenha:TextInputEditText
    lateinit var txtConfirma:TextInputEditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        txtNome = findViewById(R.id.txtNome)
        txtEmail = findViewById(R.id.txtEmail)
        txtTelefone = findViewById(R.id.txtFone)
        txtSenha = findViewById(R.id.txtSenha)
        txtConfirma = findViewById(R.id.txtConfirma)
    }

    fun validate():Boolean{

        var valido = true

        txtNome.error = null
        txtEmail.error = null
        txtTelefone.error = null
        txtSenha.error = null
        txtConfirma.error = null

        if(TextUtils.isEmpty(txtNome.text.toString())){
            txtNome.error = resources.getString(R.string.msg_obrigatorio)
            valido = false
        }
        if(TextUtils.isEmpty(txtEmail.text.toString())){
            txtEmail.error = resources.getString(R.string.msg_obrigatorio)
            valido = false
        }
        if(TextUtils.isEmpty(txtTelefone.text.toString())){
            txtTelefone.error = resources.getString(R.string.msg_obrigatorio)
            valido = false
        }
        if(TextUtils.isEmpty(txtSenha.text.toString())){
            txtSenha.error = resources.getString(R.string.msg_obrigatorio)
            valido = false
        }
        if(TextUtils.isEmpty(txtConfirma.text.toString())){
            txtConfirma.error = resources.getString(R.string.msg_obrigatorio)
            valido = false
        }

        return valido
    }

    fun salvar(v:View){
        validate()
    }


}
