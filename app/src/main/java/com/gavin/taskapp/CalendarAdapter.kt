package com.gavin.taskapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CalendarAdapter: RecyclerView.Adapter<CalendarViewHolder> {
    private val daysOfMonth: ArrayList<String>
    private val onItemListener: OnItemListener
    constructor(daysOfMonth: ArrayList<String>, onItemListener: OnItemListener) {
        this.daysOfMonth = daysOfMonth
        this.onItemListener = onItemListener
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CalendarViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        val view: View = inflater.inflate(R.layout.calendar_cell, parent, false)
        val layoutParams: ViewGroup.LayoutParams = view.layoutParams
        layoutParams.height = parent.height / 6
        return CalendarViewHolder(view, onItemListener)
    }

    override fun getItemCount(): Int {
        return daysOfMonth.size
    }

    override fun onBindViewHolder(holder: CalendarViewHolder, position: Int) {
        holder.dayOfMonth.text = this.daysOfMonth[position]
    }

    interface OnItemListener {
        fun onItemClick(position: Int, dayText: String)
    }
}