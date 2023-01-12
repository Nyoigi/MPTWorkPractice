package com.example.mptworkpractice.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mptworkpractice.R
import com.example.mptworkpractice.databinding.FragmentMainBinding
import com.example.mptworkpractice.databinding.PostAdapterItemBinding
import com.example.mptworkpractice.recyclerview.PracticeAdapter
import com.example.mptworkpractice.recyclerview.models.Practice
import com.example.mptworkpractice.utils.navigateToFragment


class MainFragment : Fragment() {
    private var binding: FragmentMainBinding? = null
    private var bindingAdapter: PostAdapterItemBinding? = null

    private val practiceList = listOf<Practice>(
        Practice(
            namePractice = "ПМ 02.01", dateStart = "2022-22-12", dateEnd = "2022-22-12",
            status = "Не сдал", estimationOrganization = 0, estimationTechnicalSchool = 0
        ),
        Practice(
            namePractice = "ПМ 02.01", dateStart = "2022-22-12", dateEnd = "2022-22-12",
            status = "Не сдал", estimationOrganization = 0, estimationTechnicalSchool = 0
        ),
        Practice(
            namePractice = "ПМ 02.01", dateStart = "2022-22-12", dateEnd = "2022-22-12",
            status = "Не сдал", estimationOrganization = 0, estimationTechnicalSchool = 0
        ),
        Practice(
            namePractice = "ПМ 02.01", dateStart = "2022-22-12", dateEnd = "2022-22-12",
            status = "Не сдал", estimationOrganization = 0, estimationTechnicalSchool = 0
        )
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding
            .inflate(inflater, container, false)

        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initAdapter()
        setListeners()
    }

    private fun initAdapter() {
        val adapter = PracticeAdapter()
        adapter.practiceList = practiceList
        binding?.rvPost?.layoutManager = LinearLayoutManager(requireContext())
        binding?.rvPost?.adapter = adapter
    }

    private fun setListeners() {

    }
}