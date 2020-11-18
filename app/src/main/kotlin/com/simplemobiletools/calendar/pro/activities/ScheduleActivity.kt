package com.simplemobiletools.calendar.pro.activities

import androidx.appcompat.app.AppCompatActivity

import android.annotation.SuppressLint
import android.app.SearchManager
import android.content.Context
import android.content.Intent
import android.content.pm.ShortcutInfo
import android.content.pm.ShortcutManager
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Icon
import android.graphics.drawable.LayerDrawable
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.core.view.MenuItemCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.simplemobiletools.calendar.pro.BuildConfig
import com.simplemobiletools.calendar.pro.R
import com.simplemobiletools.calendar.pro.extensions.config


class ScheduleActivity : SimpleActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_schedule)
    }

}
