package com.gavin.taskapp

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CalendarViewHolder: RecyclerView.ViewHolder, View.OnClickListener {
    val dayOfMonth: TextView
    private val onItemListener: CalendarAdapter.OnItemListener

    constructor(itemView: View, onItemListener: CalendarAdapter.OnItemListener) : super(itemView) {
        dayOfMonth = itemView.findViewById(R.id.cellDayText)
        this.onItemListener = onItemListener
        itemView.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        onItemListener.onItemClick(adapterPosition, dayOfMonth.text.toString())
    }
}