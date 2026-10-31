package com.callonvoice

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setPadding(30, 30, 30, 30)
        layout.setBackgroundColor(Color.WHITE)

        val title = TextView(this)
        title.text = "CALL ON VOICE"
        title.textSize = 30f
        title.setTextColor(Color.BLACK)
        title.gravity = Gravity.CENTER

        val subtitle = TextView(this)
        subtitle.text = "Your Voice, Your Control"
        subtitle.textSize = 18f
        subtitle.setTextColor(Color.DKGRAY)
        subtitle.gravity = Gravity.CENTER

        layout.addView(title)
        layout.addView(subtitle)

        setContentView(layout)
    }
}
