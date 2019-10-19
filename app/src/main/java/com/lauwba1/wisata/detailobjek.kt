package com.lauwba1.wisata

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class detailobjek : AppCompatActivity() {

    lateinit var tv_title: TextView
    lateinit var tv_detail: TextView
    lateinit var iv_gambar: ImageView
    private var fab: FloatingActionButton? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailobjek)

        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        iv_gambar = findViewById(R.id.iv_gambar) as ImageView
        tv_title = findViewById(R.id.judul)
        tv_detail = findViewById(R.id.isi)
        var t: String? = intent.getStringExtra("Title")
        var d: String? = intent.getStringExtra("Detail")
        var url: String? = intent.getStringExtra("URL")

        supportActionBar?.title = t

        tv_title.setText(t)
        tv_detail.setText(d)
        var a = tv_title.text
        when (a) {
            "jembatan repo-repo" -> iv_gambar.setImageResource(R.drawable.jembatan1)
            "pulau kumala" -> iv_gambar.setImageResource(R.drawable.pulau)
            "museum kayu" -> iv_gambar.setImageResource(R.drawable.kayu)
            "museum mulawarman" -> iv_gambar.setImageResource(R.drawable.museum)
            "ladaya" -> iv_gambar.setImageResource(R.drawable.ladaya)
            "planetarium" -> iv_gambar.setImageResource(R.drawable.planet)
            "taman bawah jembatan" -> iv_gambar.setImageResource(R.drawable.tgr)
            "puncak bukit biru" -> iv_gambar.setImageResource(R.drawable.puncak)
        }
        fab = findViewById(R.id.fab) as FloatingActionButton
        fab!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse(url)
                )
                startActivity(intent)
            }
        })
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}
