package com.lauwba1.wisata

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.LinearLayout
import com.wang.avi.AVLoadingIndicatorView

class spalshscreen : AppCompatActivity() {
    lateinit var handler: Handler;
    lateinit var loading: AVLoadingIndicatorView
    lateinit var loadingg:LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spalshscreen)

        loading=findViewById(R.id.avi)
        loadingg=findViewById(R.id.lv_loading);
        loading.setIndicator("BallClipRotateMultipleIndicator");


        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        handler = Handler()
        handler.postDelayed(Runnable {
            var intent: Intent
            intent = Intent(this@spalshscreen, MainActivity::class.java)
            startActivity(intent)
            this@spalshscreen.finish()
        }, 3000)
    }
}
