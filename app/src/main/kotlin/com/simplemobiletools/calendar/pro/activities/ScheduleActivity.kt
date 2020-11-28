package com.simplemobiletools.calendar.pro.activities

import android.graphics.Color
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.simplemobiletools.calendar.pro.R
import kotlinx.android.synthetic.main.activity_schedule.*


class ScheduleActivity : SimpleActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_schedule)
//        val done: TextView = findViewById(R.id.done_meet)
//        done.setOnClickListener {
//            val image = findViewById<View>(R.id.emptyMeet) as ImageView
//            image.setImageResource(R.drawable.meet_group)
//
//        }

        val buttonA: Button = findViewById<View>(R.id.done_meet) as Button
        val buttonB: Button = findViewById<View>(R.id.sendInvite) as Button
        val titleText: EditText = findViewById<EditText>(R.id.meeting_title)
        val startTime: EditText = findViewById<EditText>(R.id.startTime)
        val fromText: TextView = findViewById<TextView>(R.id.textView)
        val toText: TextView = findViewById<TextView>(R.id.textView3)
        val endTime: EditText = findViewById<EditText>(R.id.endTime)
        val notesText: EditText = findViewById<EditText>(R.id.notesText)
        val groupName: EditText = findViewById<EditText>(R.id.editTextTextPersonName2)

        groupName.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                buttonA.isEnabled = false
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

                if(count == 0){
                    buttonA.setBackgroundColor(Color.parseColor("#7EC636"))
                    titleText.visibility = View.INVISIBLE
                    startTime.visibility = View.INVISIBLE
                    fromText.visibility = View.INVISIBLE
                    toText.visibility = View.INVISIBLE
                    endTime.visibility = View.INVISIBLE
                    notesText.visibility = View.INVISIBLE
                    buttonB.visibility = View.INVISIBLE
                }else{
                    buttonA.isEnabled = true
                    done_meet.setOnClickListener {
                        buttonB.setBackgroundColor(Color.parseColor("#7EC636"))
                        buttonA.setBackgroundColor(Color.GRAY)
                        titleText.visibility = View.VISIBLE
                        startTime.visibility = View.VISIBLE
                        fromText.visibility = View.VISIBLE
                        toText.visibility = View.VISIBLE
                        endTime.visibility = View.VISIBLE
                        notesText.visibility = View.VISIBLE
                        buttonB.visibility = View.VISIBLE
                    }
                }

            }
        })


    }
}


