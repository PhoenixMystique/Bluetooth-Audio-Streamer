package com.example.bluetooth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity(){
lateinit var text:TextView
lateinit var recording: Recording
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

text= findViewById(R.id.textView)
    }

    fun record(view:View){
        val BluetoothRecording: OnBluetoothRecording = object : OnBluetoothRecording {
            override fun onStartRecording(state: Boolean, bluetoothFlag: Boolean) {
                text.visibility=View.VISIBLE
            }
            override fun onCancelRecording() {
                text.visibility=View.GONE
            }
        }
        recording=Recording()
        recording.checkAndRecord(this,BluetoothRecording,true)

    }
   fun StopRecprd(view: View){


    }
    fun Play(view:View){


    }



}
