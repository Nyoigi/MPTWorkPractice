package com.example.mptworkpractice.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.mptworkpractice.R
import com.example.mptworkpractice.presentation.MainFragment
import com.example.mptworkpractice.recyclerview.models.Practice
import com.example.mptworkpractice.utils.navigateToFragment
import org.w3c.dom.Text

class PracticeAdapter : RecyclerView.Adapter<PracticeAdapter.PracticeViewHolder>() {

    var practiceList = listOf<Practice>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PracticeViewHolder {
        return PracticeViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.post_adapter_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: PracticeViewHolder, position: Int) {
        holder.bind(
            namePractice = practiceList[position].namePractice,
            dateStart = practiceList[position].dateStart,
            dateEnd = practiceList[position].dateEnd,
            status = practiceList[position].status,
            estimationOrganization = practiceList[position].estimationOrganization,
            estimationTechnicalSchool = practiceList[position].estimationTechnicalSchool
        )
    }

    override fun getItemCount(): Int {
        return practiceList.size
    }

    class PracticeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        init {
            itemView.findViewById<View>(R.id.tvNameModule).setOnClickListener {

            }
        }


        fun bind(namePractice: String,dateStart: String,dateEnd: String,
                  status: String, estimationOrganization: Int,
                  estimationTechnicalSchool: Int) {
            itemView.findViewById<TextView>(R.id.tvNameModule).text = namePractice
            itemView.findViewById<TextView>(R.id.tvdateStartModule).text = dateStart
            itemView.findViewById<TextView>(R.id.tvdateEndModule).text = dateEnd
            itemView.findViewById<TextView>(R.id.tvstatusPractice).text = status
            itemView.findViewById<TextView>(R.id.tvevaluationOfTheOrganization).text =
                estimationOrganization.toString()
            itemView.findViewById<TextView>(R.id.tvteacherEvaluation).text =
                estimationTechnicalSchool.toString()
        }
    }
}