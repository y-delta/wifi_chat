package com.example.myapp.ui.ledger

import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapp.R

class TakeInput : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_take_input)

        // Single checked box

    }

    fun onCheckboxClicked(view: View) {
        var checked = view as CheckBox

    }

    fun message(str: String) {
        Toast.makeText(this, str, Toast.LENGTH_LONG).show()
    }
//
//    fun onButtonClick(view: View) {
//        var location = text_location.text.toString()
//        var landmark = text_landmark.text.toString()
//        val mFragment = Fragment()
//        val mArgs = Bundle()
//        mArgs.putString("Location", location)
//        mFragment.setArguments(mArgs)
//

}
