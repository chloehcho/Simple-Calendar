package com.simplemobiletools.calendar.pro.activities

import android.R.attr.bottom
import android.R.attr.left
import android.R.attr.right
import android.R.attr.top
import android.os.Bundle
import android.view.View
import android.view.ViewGroup.MarginLayoutParams
import android.widget.ImageView
import android.widget.TextView
import com.simplemobiletools.calendar.pro.R


class ScheduleActivity : SimpleActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_schedule)
        val done: TextView = findViewById(R.id.done_meet)
        done.setOnClickListener {
            val image = findViewById<View>(R.id.emptyMeet) as ImageView
            image.setImageResource(R.drawable.meet_group)

        }



    }
}
