package jp.techacademy.hironaka.satoshi.aisatuapp

import android.app.TimePickerDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text
import java.text.SimpleDateFormat
import java.util.*

var ho = 0
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mPickTimeBtn = findViewById<Button>(R.id.button1)
        val textView     = findViewById<TextView>(R.id.textView)

        mPickTimeBtn.setOnClickListener {
            val timeSetListener = TimePickerDialog.OnTimeSetListener { timePicker, hour, minute ->
                ho = hour
                if (hour >= 2 && hour < 10){
                    textView.text = "おはよう"
                }else if(hour >= 10 && hour <18){
                    textView.text = "こんにちは"
                }else {
                    textView.text = "こんばんは"
                }
            }
            TimePickerDialog(this, timeSetListener, 12, 0, true).show()
        }


    }
}