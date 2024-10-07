package com.scd.buku25_nabi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var kisahAdapter: KisahAdapter
    private lateinit var aboutButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Menginisialisasi RecyclerView
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Membuat daftar kisah nabi
        val kisahList = listOf(
            KisahNabi("Nabi Adam AS", R.drawable.nabiadam,),
            KisahNabi("Nabi Idris AS", R.drawable.nabiidris),
            KisahNabi("Nabi Nuh AS", R.drawable.nabinuh),
            KisahNabi("Nabi Hud AS", R.drawable.nabihud),
            KisahNabi("Nabi Saleh AS", R.drawable.nabisaleh),
            KisahNabi("Nabi Ibrahim AS", R.drawable.nabiibrahim),
            KisahNabi("Nabi Lut AS", R.drawable.nabiluth),
            KisahNabi("Nabi Ismail AS", R.drawable.nabiismail),
            KisahNabi("Nabi Ishaq AS", R.drawable.nabiishaq),
            KisahNabi("Nabi Yaqub AS", R.drawable.nabiyaqub),
            KisahNabi("Nabi Yusuf AS", R.drawable.nabiyusuf),
            KisahNabi("Nabi Syu'aib AS", R.drawable.nabisyuaib),
            KisahNabi("Nabi Ayyub AS", R.drawable.nabiayyub),
            KisahNabi("Nabi Dhulkifli AS", R.drawable.nabidzulkifli),
            KisahNabi("Nabi Musa AS", R.drawable.nabimusa),
            KisahNabi("Nabi Harun AS", R.drawable.nabiharun),
            KisahNabi("Nabi Dawud AS", R.drawable.nabidawud),
            KisahNabi("Nabi Sulaiman AS", R.drawable.nabisulaiman),
            KisahNabi("Nabi Ilyas AS", R.drawable.nabiilyas),
            KisahNabi("Nabi Ilyasa AS", R.drawable.nabiisa),
            KisahNabi("Nabi Yunus AS", R.drawable.nabiyunus),
            KisahNabi("Nabi Zakaria AS", R.drawable.nabizakariya),
            KisahNabi("Nabi Yahya AS", R.drawable.nabiyahya),
            KisahNabi("Nabi Isa AS", R.drawable.nabiisa),
            KisahNabi("Nabi Muhammad SAW", R.drawable.nabimuhammad)
        )



        // Menginisialisasi adapter
        kisahAdapter = KisahAdapter(kisahList) { kisah ->

            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("NABI_JUDUL", kisah.judul)
            intent.putExtra("NABI_FOTO", kisah.foto)
            startActivity(intent)
        }

        // Mengatur adapter untuk RecyclerView
        recyclerView.adapter = kisahAdapter

        // Menginisialisasi tombol About
        aboutButton = findViewById(R.id.about_button)
        aboutButton.setOnClickListener {
            // Menangani klik tombol About
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }
    }
}
