package com.example.mymarketlist.presentation.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mymarketlist.R

class NoteContentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_content)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().replace(
                R.id.container,
                NoteContentFragment.newInstance()
            ).commitNow()
        }
    }
}