package com.scd.buku25_nabi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.ImageView

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val namaTextView: TextView = findViewById(R.id.namaTextView)
        val emailTextView: TextView = findViewById(R.id.emailTextView)
        val descriptionTextView: TextView = findViewById(R.id.descriptionTextView)
        val pemberitahuan: TextView = findViewById(R.id.pemberitahuanpenting)
        val versionTextView: TextView = findViewById(R.id.versionTextView)
        val profileImageView: ImageView = findViewById(R.id.profileImageView)

        namaTextView.text = "Vioazuhri"
        emailTextView.text = "Vioazuhri22@gmail.com"
        descriptionTextView.text = "Aplikasi ini memberikan kisah-kisah dari 25 Nabi dalam Islam."
        versionTextView.text = "Version: 1.0"
    }
}
