package org.d3if4202.praassesment


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import kotlinx.android.synthetic.main.fragment_persegi_panjang.*
import kotlinx.android.synthetic.main.fragment_segitiga.*
import org.d3if4202.praassesment.databinding.FragmentFirstBinding
import org.d3if4202.praassesment.databinding.FragmentSegitigaBinding


class SegitigaFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentSegitigaBinding>(
            inflater, R.layout.fragment_segitiga, container, false)



        binding.btnHitungSegitiga.setOnClickListener {

            val alas = et_alas.text.toString().toInt()
            val tinggi = et_tinggi.text.toString().toInt()

            val luas =  0.5 * alas * tinggi
            val keliling =   alas * tinggi

            txt_hasil_luas_segitiga.text = luas.toString()
            txt_hasil_keliling_segitiga.text = keliling.toString()
        }

        binding.btnShareSegitiga.setOnClickListener {
            val subject = "Perhitungan Segitiga"
            val message = "Luas Segitiga = " + txt_hasil_luas_segitiga.text + "\n " + "" +
                    "Keliling Segitiga = " +txt_hasil_keliling_segitiga.text
            val addresses = "Ridloyanuar@gmail.com"
            composeEmail(addresses,subject,message)
        }


        return binding.root
    }

     fun composeEmail(addresses: String, subject: String, message: String) {
        val intent = Intent(Intent.ACTION_SENDTO).apply {
            data = Uri.parse("mailto:") // only email apps should handle this
            putExtra(Intent.EXTRA_EMAIL, arrayOf(addresses))
            putExtra(Intent.EXTRA_SUBJECT, subject)
            putExtra(Intent.EXTRA_TEXT, message)
        }
        startActivity(intent)
    }


}
