package br.com.etec.aula5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()

        val intent = Intent(this, LoginActivity::class.java)
        startActivityForResult(intent,1010)

    }

    fun register(v:View){

        val intent = Intent(this, RegisterActivity:class.java)
        startActivity(intent)

    }
}
