package com.a2z.quizzzes.ui.exams.exams_list

import android.annotation.SuppressLint
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.a2z.quizzzes.R
import com.a2z.quizzzes.databinding.ItemExamBinding
import com.a2z.quizzzes.model.ExamModel
import com.a2z.quizzzes.model.ExamStatus

class ExamsAdapter constructor(
    private val onItemClicked: ((transaction: ExamModel) -> Unit)? = null,
) : ListAdapter<ExamModel, ExamsAdapter.ItemViewHolder>(DIFF_CALLBACK) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding =
            ItemExamBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = getItem(position)
        if (item != null) holder.bind(item)
    }

    inner class ItemViewHolder(private val binding: ItemExamBinding) :
        RecyclerView.ViewHolder(binding.root) {

        @SuppressLint("SetTextI18n")
        fun bind(item: ExamModel) {
            with(binding) {
                // Exam Name
                tvExamName.text = item.name

                // Needed Percentage
                tvPercentageNeeded.text = "${item.percentageToPass}%"

                // No of Questions
                tvPercentageNeeded.text = item.questionsList?.size?.toString()

                // Status
                when (item.status) {
                    ExamStatus.NOT_TAKEN -> {
                        tvStatus.setTextColor(Color.BLACK)
                        tvStatus.text = tvStatus.context.getString(R.string.exam_not_taken_yet)
                    }
                    ExamStatus.PASSED -> {
                        tvStatus.setTextColor(Color.GREEN)
                        tvStatus.text = tvStatus.context.getString(R.string.exam_passed_retake)
                    }
                    ExamStatus.FAILED -> {
                        tvStatus.setTextColor(Color.RED)
                        tvStatus.text = tvStatus.context.getString(R.string.exam_failed_retake)
                    }
                    null -> Unit
                }

                rootView.setOnClickListener {
                    onItemClicked?.invoke(item)
                }

            }
        }
    }

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<ExamModel>() {
            override fun areItemsTheSame(
                oldItem: ExamModel,
                newItem: ExamModel
            ): Boolean =
                oldItem.id == newItem.id

            override fun areContentsTheSame(
                oldItem: ExamModel,
                newItem: ExamModel
            ): Boolean = oldItem.id == newItem.id &&
                    oldItem.status == newItem.status
        }
    }

}