package com.novelitech.toolbarmenuskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.app_bar_menu, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId) {
            R.id.miAddContact -> Toast.makeText(this, "Contact", Toast.LENGTH_LONG)
            R.id.miClose -> Toast.makeText(this, "Close", Toast.LENGTH_LONG)
            R.id.miFavorites -> Toast.makeText(this, "Favorites", Toast.LENGTH_LONG)
            R.id.miFeedback -> Toast.makeText(this, "Feedback", Toast.LENGTH_LONG)
            R.id.miSettings -> Toast.makeText(this, "Settings", Toast.LENGTH_LONG)
        }

        return true
    }
}