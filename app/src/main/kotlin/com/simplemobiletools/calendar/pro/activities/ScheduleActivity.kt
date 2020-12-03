package com.simplemobiletools.calendar.pro.activities

import android.app.AlertDialog
import android.graphics.Color
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.*
import com.simplemobiletools.calendar.pro.R
import kotlinx.android.synthetic.main.activity_schedule.*


class ScheduleActivity : SimpleActivity() {
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_schedule)

        textView = findViewById(R.id.sendInvite)
        textView.setOnClickListener { showAlertDialog() }

        val buttonA: Button = findViewById<View>(R.id.done_meet) as Button
        val buttonB: Button = findViewById<View>(R.id.sendInvite) as Button
        val titleText: EditText = findViewById<EditText>(R.id.meeting_title)
        val startTime: EditText = findViewById<EditText>(R.id.startTime)
        val fromText: TextView = findViewById<TextView>(R.id.textView)
        val toText: TextView = findViewById<TextView>(R.id.textView3)
        val endTime: EditText = findViewById<EditText>(R.id.endTime)
        val notesText: EditText = findViewById<EditText>(R.id.notesText)
        val groupName: EditText = findViewById<EditText>(R.id.editTextTextPersonName2)
        val meetEnd: ImageView = findViewById<ImageView>(R.id.meet_end)
        meetEnd.visibility = View.INVISIBLE

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
                    meetEnd.visibility = View.INVISIBLE



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
                        meetEnd.visibility = View.VISIBLE

                    }
                }

            }
        })

    }
    private fun showAlertDialog() {
        val alertDialog: AlertDialog.Builder = AlertDialog.Builder(this)
        alertDialog.setTitle("Confirm Meeting")
        alertDialog.setMessage("Would you like to send invite?")
        alertDialog.setPositiveButton(
                "Confirm"
        ) { _, _ ->
            Toast.makeText(this, "Meeting invite sent!", Toast.LENGTH_LONG).show()
        }
        alertDialog.setNegativeButton(
                "Cancel"
        ) { _, _ -> }
        val alert: AlertDialog = alertDialog.create()
        alert.setCanceledOnTouchOutside(false)
        alert.show()
    }
}


