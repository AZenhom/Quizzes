package com.a2z.quizzzes.ui.topics

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.a2z.quizzzes.databinding.ItemTopicBinding
import com.a2z.quizzzes.model.TopicModel

class TopicsAdapter constructor(
    private val onItemClicked: ((topicModel: TopicModel) -> Unit)? = null,
) : ListAdapter<TopicModel, TopicsAdapter.ItemViewHolder>(DIFF_CALLBACK) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding =
            ItemTopicBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = getItem(position)
        if (item != null) holder.bind(item)
    }

    inner class ItemViewHolder(private val binding: ItemTopicBinding) :
        RecyclerView.ViewHolder(binding.root) {

        @SuppressLint("DiscouragedApi")
        fun bind(item: TopicModel) {
            with(binding) {
                // Topic Name
                tvTopicName.text = item.name

                // Topic Image
                with(ivTopic) {
                    setImageResource(
                        context.resources.getIdentifier(
                            item.resName, "drawable", context.applicationContext.packageName
                        )
                    )
                }

                clRootView.setOnClickListener {
                    onItemClicked?.invoke(item)
                }

            }
        }
    }

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<TopicModel>() {
            override fun areItemsTheSame(
                oldItem: TopicModel,
                newItem: TopicModel
            ): Boolean =
                oldItem.id == newItem.id

            override fun areContentsTheSame(
                oldItem: TopicModel,
                newItem: TopicModel
            ): Boolean = oldItem.id == newItem.id &&
                    oldItem.name == newItem.name &&
                    oldItem.resName == newItem.resName
        }
    }

}