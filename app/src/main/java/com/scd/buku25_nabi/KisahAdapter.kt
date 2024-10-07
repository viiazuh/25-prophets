package com.scd.buku25_nabi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class KisahAdapter(
    private val kisahList: List<KisahNabi>,
    private val onItemClick: (KisahNabi) -> Unit
) : RecyclerView.Adapter<KisahAdapter.KisahViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KisahViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_kisah, parent, false)
        return KisahViewHolder(view)
    }

    override fun onBindViewHolder(holder: KisahViewHolder, position: Int) {
        val kisah = kisahList[position]
        holder.bind(kisah)

        holder.itemView.setOnClickListener {
            onItemClick(kisah)
        }
    }

    override fun getItemCount(): Int = kisahList.size

    class KisahViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imageKisah: ImageView = itemView.findViewById(R.id.image_kisah)
        private val textTitle: TextView = itemView.findViewById(R.id.text_title)

        // Mendapatkan semua deskripsi
        private val descriptionAdam: TextView = itemView.findViewById(R.id.text_description_adam)
        private val descriptionIdris: TextView = itemView.findViewById(R.id.text_description_idris)
        private val descriptionNuh: TextView = itemView.findViewById(R.id.text_description_nuh)
        private val descriptionHud: TextView = itemView.findViewById(R.id.text_description_hud)
        private val descriptionSaleh: TextView = itemView.findViewById(R.id.text_description_saleh)
        private val descriptionIbrahim: TextView = itemView.findViewById(R.id.text_description_ibrahim)
        private val descriptionLut: TextView = itemView.findViewById(R.id.text_description_lut)
        private val descriptionIsmail: TextView = itemView.findViewById(R.id.text_description_ismail)
        private val descriptionIshaq: TextView = itemView.findViewById(R.id.text_description_ishaq)
        private val descriptionYaqub: TextView = itemView.findViewById(R.id.text_description_yaqub)
        private val descriptionYusuf: TextView = itemView.findViewById(R.id.text_description_yusuf)
        private val descriptionShuayb: TextView = itemView.findViewById(R.id.text_description_shuayb)
        private val descriptionAyyub: TextView = itemView.findViewById(R.id.text_description_ayyub)
        private val descriptionDhulkifl: TextView = itemView.findViewById(R.id.text_description_dhul_kifl)
        private val descriptionMusa: TextView = itemView.findViewById(R.id.text_description_musa)
        private val descriptionHarun: TextView = itemView.findViewById(R.id.text_description_harun)
        private val descriptionDawud: TextView = itemView.findViewById(R.id.text_description_dawud)
        private val descriptionSulayman: TextView = itemView.findViewById(R.id.text_description_sulayman)
        private val descriptionIlyas: TextView = itemView.findViewById(R.id.text_description_ilyas)
        private val descriptionIlyasa: TextView = itemView.findViewById(R.id.text_description_ilyasa)
        private val descriptionYunus: TextView = itemView.findViewById(R.id.text_description_yunus)
        private val descriptionZakaria: TextView = itemView.findViewById(R.id.text_description_zakaria)
        private val descriptionYahya: TextView = itemView.findViewById(R.id.text_description_yahya)
        private val descriptionIsa: TextView = itemView.findViewById(R.id.text_description_isa)
        private val descriptionMuhammad: TextView = itemView.findViewById(R.id.text_description_muhammad)

        fun bind(kisah: KisahNabi) {
            imageKisah.setImageResource(kisah.foto)
            textTitle.text = kisah.judul

            // Menyembunyikan semua deskripsi terlebih dahulu
            descriptionAdam.visibility = View.GONE
            descriptionIdris.visibility = View.GONE
            descriptionNuh.visibility = View.GONE
            descriptionHud.visibility = View.GONE
            descriptionSaleh.visibility = View.GONE
            descriptionIbrahim.visibility = View.GONE
            descriptionLut.visibility = View.GONE
            descriptionIsmail.visibility = View.GONE
            descriptionIshaq.visibility = View.GONE
            descriptionYaqub.visibility = View.GONE
            descriptionYusuf.visibility = View.GONE
            descriptionShuayb.visibility = View.GONE
            descriptionAyyub.visibility = View.GONE
            descriptionDhulkifl.visibility = View.GONE
            descriptionMusa.visibility = View.GONE
            descriptionHarun.visibility = View.GONE
            descriptionDawud.visibility = View.GONE
            descriptionSulayman.visibility = View.GONE
            descriptionIlyas.visibility = View.GONE
            descriptionIlyasa.visibility = View.GONE
            descriptionYunus.visibility = View.GONE
            descriptionZakaria.visibility = View.GONE
            descriptionYahya.visibility = View.GONE
            descriptionIsa.visibility = View.GONE
            descriptionMuhammad.visibility = View.GONE

            // Menampilkan deskripsi berdasarkan judul
            when (kisah.judul) {
                "Nabi Adam AS" -> descriptionAdam.visibility = View.VISIBLE
                "Nabi Idris AS" -> descriptionIdris.visibility = View.VISIBLE
                "Nabi Nuh AS" -> descriptionNuh.visibility = View.VISIBLE
                "Nabi Hud AS" -> descriptionHud.visibility = View.VISIBLE
                "Nabi Saleh AS" -> descriptionSaleh.visibility = View.VISIBLE
                "Nabi Ibrahim AS" -> descriptionIbrahim.visibility = View.VISIBLE
                "Nabi Lut AS" -> descriptionLut.visibility = View.VISIBLE
                "Nabi Ismail AS" -> descriptionIsmail.visibility = View.VISIBLE
                "Nabi Ishaq AS" -> descriptionIshaq.visibility = View.VISIBLE
                "Nabi Yaqub AS" -> descriptionYaqub.visibility = View.VISIBLE
                "Nabi Yusuf AS" -> descriptionYusuf.visibility = View.VISIBLE
                "Nabi Syu'aib AS" -> descriptionShuayb.visibility = View.VISIBLE
                "Nabi Ayyub AS" -> descriptionAyyub.visibility = View.VISIBLE
                "Nabi Dhulkifli AS" -> descriptionDhulkifl.visibility = View.VISIBLE
                "Nabi Musa AS" -> descriptionMusa.visibility = View.VISIBLE
                "Nabi Harun AS" -> descriptionHarun.visibility = View.VISIBLE
                "Nabi Dawud AS" -> descriptionDawud.visibility = View.VISIBLE
                "Nabi Sulaiman AS" -> descriptionSulayman.visibility = View.VISIBLE
                "Nabi Ilyas AS" -> descriptionIlyas.visibility = View.VISIBLE
                "Nabi Ilyasa AS" -> descriptionIlyasa.visibility = View.VISIBLE
                "Nabi Yunus AS" -> descriptionYunus.visibility = View.VISIBLE
                "Nabi Zakaria AS" -> descriptionZakaria.visibility = View.VISIBLE
                "Nabi Yahya AS" -> descriptionYahya.visibility = View.VISIBLE
                "Nabi Isa AS" -> descriptionIsa.visibility = View.VISIBLE
                "Nabi Muhammad SAW" -> descriptionMuhammad.visibility = View.VISIBLE
            }
        }
    }
}
