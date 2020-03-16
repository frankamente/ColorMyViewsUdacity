package com.example.android.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickableView: List<View> =
            listOf(
                box_one_text, box_two_text, box_three_text,
                box_four_text, box_five_text, constraint_layout,
                red_button, yellow_button, green_button
            )
        for (item in clickableView) {
            item.setOnClickListener{ makeColored(it)}
        }
    }

    private fun makeColored(view: View) {
        when (view.id){
            box_one_text.id -> view.setBackgroundColor(Color.DKGRAY)
            box_two_text.id -> view.setBackgroundColor(Color.GRAY)

            box_three_text.id -> view.setBackgroundResource(android.R.color.holo_green_light)
            box_four_text.id -> view.setBackgroundResource(android.R.color.holo_green_dark)
            box_five_text.id -> view.setBackgroundResource(android.R.color.holo_green_light)

            red_button.id -> box_three_text.setBackgroundResource(R.color.my_red)
            yellow_button.id -> box_four_text.setBackgroundResource(R.color.my_yellow)
            green_button.id -> box_five_text.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}
