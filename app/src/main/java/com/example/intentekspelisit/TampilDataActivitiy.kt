package com.example.intentekspelisit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class TampilDataActivitiy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tampil_data_activitiy)

        val tvData =findViewById<TextView>(R.id.tvData)

        val nim = intent.getStringExtra("NIM")
        val nama= intent.getStringExtra("Nama")

        tvData.text ="""
            Data yang dimasukkan:
            NIM : $nim
            Nama: $nama
        """.trimIndent()
    }
}