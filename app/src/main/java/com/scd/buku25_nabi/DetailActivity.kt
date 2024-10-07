package com.scd.buku25_nabi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    private lateinit var judulDetailTextView: TextView
    private lateinit var deskripsiDetailTextView: TextView
    private lateinit var misiTextView: TextView
    private lateinit var tanggalTempatLahirTextView: TextView
    private lateinit var informasiKeluargaTextView: TextView
    private lateinit var pendidikanTextView: TextView
    private lateinit var fotoImageView: ImageView
    private lateinit var shareButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // Inisialisasi View
        judulDetailTextView = findViewById(R.id.judulDetailTextView)
        deskripsiDetailTextView = findViewById(R.id.deskripsiDetailTextView)
        misiTextView = findViewById(R.id.misiTextView)
        tanggalTempatLahirTextView = findViewById(R.id.tanggalTempatLahirTextView)
        informasiKeluargaTextView = findViewById(R.id.keluargaTextView)
        pendidikanTextView = findViewById(R.id.pendidikanTextView)
        fotoImageView = findViewById(R.id.fotoImageView)
        shareButton = findViewById(R.id.action_share)

        // Mendapatkan data dari Intent
        val judul = intent.getStringExtra("NABI_JUDUL")
        val foto = intent.getIntExtra("NABI_FOTO", 0)

        // Menampilkan judul dan gambar
        judulDetailTextView.text = judul ?: "Judul tidak valid"
        fotoImageView.setImageResource(if (foto != 0) foto else R.drawable.nabimuhammad)

        // Mengambil deskripsi dan informasi lainnya berdasarkan judul
        val deskripsiArray = resources.getStringArray(R.array.deskripsi_kisah)
        val misiArray = resources.getStringArray(R.array.misi)
        val tanggalTempatLahirArray = resources.getStringArray(R.array.tanggal_tempat_lahir)
        val informasiKeluargaArray = resources.getStringArray(R.array.informasi_keluarga)
        val pendidikanArray = resources.getStringArray(R.array.pendidikan)

        // Mendapatkan index dari judul
        val index = getIndexOfJudul(judul)

        // Menampilkan deskripsi dan informasi lainnya berdasarkan index
        deskripsiDetailTextView.text = if (index != -1) deskripsiArray[index] else "Deskripsi tidak ditemukan."
        misiTextView.text = if (index != -1) misiArray[index] else "Misi tidak ditemukan."
        tanggalTempatLahirTextView.text = if (index != -1) tanggalTempatLahirArray[index] else "Informasi tanggal dan tempat lahir tidak ditemukan."
        informasiKeluargaTextView.text = if (index != -1) informasiKeluargaArray[index] else "Informasi keluarga tidak ditemukan."
        pendidikanTextView.text = if (index != -1) pendidikanArray[index] else "Informasi pendidikan tidak ditemukan."

        // Set up tombol berbagi
        shareButton.setOnClickListener {
            shareContent(judul, deskripsiArray.getOrNull(index))
        }
    }

    private fun getIndexOfJudul(judul: String?): Int {
        val judulList = resources.getStringArray(R.array.judul_nabi)
        return judulList.indexOf(judul)
    }

    private fun shareContent(judul: String?, deskripsi: String?) {
        val shareIntent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, "$judul\n\n$deskripsi")
            type = "text/plain"
        }
        startActivity(Intent.createChooser(shareIntent, "Bagikan melalui"))
    }
}
