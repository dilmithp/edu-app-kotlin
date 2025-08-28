package com.sadeesha.platform.classroomappui

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class CustomAdapterSetting(
    private val context: Activity,
    private val name: Array<String>,
    private val num: Array<String>
) : ArrayAdapter<String>(context, R.layout.setting, name) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        // Use the ViewHolder pattern for efficiency
        val view: View
        val viewHolder: ViewHolder

        // Check if an existing view is being reused, otherwise inflate a new one
        if (convertView == null) {
            val inflater = LayoutInflater.from(context)
            view = inflater.inflate(R.layout.setting, parent, false)
            viewHolder = ViewHolder(
                view.findViewById(R.id.medium_text),
                view.findViewById(R.id.small_text)
            )
            view.tag = viewHolder
        } else {
            view = convertView
            viewHolder = view.tag as ViewHolder
        }

        // Set the text for the views
        viewHolder.mediumText.text = name[position]
        viewHolder.smallText.text = num[position]

        return view
    }

    // ViewHolder class to hold the views for recycling
    private class ViewHolder(val mediumText: TextView, val smallText: TextView)
}