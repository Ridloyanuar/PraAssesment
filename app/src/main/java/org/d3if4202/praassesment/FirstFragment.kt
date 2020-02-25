package org.d3if4202.praassesment


import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import org.d3if4202.praassesment.R.*
import org.d3if4202.praassesment.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentFirstBinding>(
            inflater, layout.fragment_first, container, false)
        binding.btnPersegiPanjang.setOnClickListener { view: View ->
            view.findNavController(). navigate(
                R.id.action_firstFragment_to_persegiPanjangFragment
            )
        }
        binding.btnSegitiga.setOnClickListener { view: View ->
            view.findNavController(). navigate(
                R.id.action_firstFragment_to_segitigaFragment
            )
        }
        setHasOptionsMenu(true)

        return binding.root

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item,
            view!!.findNavController()) || super.onOptionsItemSelected(item)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.main_menu, menu)
    }
}
