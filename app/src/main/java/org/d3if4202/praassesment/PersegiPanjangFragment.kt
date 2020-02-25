package org.d3if4202.praassesment


import android.os.Bundle
import android.text.Editable
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import kotlinx.android.synthetic.main.fragment_persegi_panjang.*
import org.d3if4202.praassesment.databinding.FragmentFirstBinding
import org.d3if4202.praassesment.databinding.FragmentPersegiPanjangBinding


class PersegiPanjangFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentPersegiPanjangBinding>(
            inflater, R.layout.fragment_persegi_panjang, container, false)



        binding.btnHitungPp.setOnClickListener {
            val panjang = et_panjang.text.toString().toInt()
            val lebar = et_lebar.text.toString().toInt()

            val luas = panjang*lebar
            val keliling = 2*panjang*lebar


            txt_hasil_luas_pp.text = luas.toString()
            txt_hasil_keliling_pp.text = keliling.toString()
        }

        return binding.root
    }


}

