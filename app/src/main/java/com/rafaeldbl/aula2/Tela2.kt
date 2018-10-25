package com.rafaeldbl.aula2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Tela2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        val message = intent.getStringExtra(EXTRA_MESSAGE)

        val textView = findViewById<TextView>(R.id.textView).apply {
            text = "BEM VINDO!! \n $message A AULA DE ANDROID."
        }

        val btn = findViewById<Button>(R.id.button2)
        btn.setOnClickListener {
            Toast.makeText(this@Tela2, "This is a Toast Message", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        Log.i("Info Tela 2", "${item.title}  - ${item.titleCondensed}")
        if (item.title == "Tela 3") {
            val intent = Intent(this@Tela2, Tela3::class.java)
            startActivity(intent)
            return true
        }

        return super.onOptionsItemSelected(item)
    }
}
