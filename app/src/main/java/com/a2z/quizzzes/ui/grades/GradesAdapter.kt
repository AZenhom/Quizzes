package com.a2z.quizzzes.ui.grades

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.a2z.quizzzes.databinding.ItemGradeBinding
import com.a2z.quizzzes.model.GradeModel

class GradesAdapter constructor(
    private val onItemClicked: ((gradeModel: GradeModel) -> Unit)? = null,
) : ListAdapter<GradeModel, GradesAdapter.ItemViewHolder>(DIFF_CALLBACK) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding =
            ItemGradeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = getItem(position)
        if (item != null) holder.bind(item)
    }

    inner class ItemViewHolder(private val binding: ItemGradeBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: GradeModel) {
            with(binding) {
                // Grade Name
                tvGradeName.text = item.name

                clRootView.setOnClickListener {
                    onItemClicked?.invoke(item)
                }

            }
        }
    }

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<GradeModel>() {
            override fun areItemsTheSame(
                oldItem: GradeModel,
                newItem: GradeModel
            ): Boolean =
                oldItem.id == newItem.id

            override fun areContentsTheSame(
                oldItem: GradeModel,
                newItem: GradeModel
            ): Boolean = oldItem.id == newItem.id &&
                    oldItem.name == newItem.name
        }
    }

}