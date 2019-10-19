package com.lauwba1.wisata

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.synnapps.carouselview.CarouselView
import com.synnapps.carouselview.ImageListener

class home : Fragment(),
    View.OnClickListener {

    lateinit var carouselView: CarouselView
    lateinit var btn_profile: ImageButton
    lateinit var btn_lokasi: ImageButton
    lateinit var btn_video: ImageButton
    lateinit var btn_galeri: ImageButton
    lateinit var btn_web: ImageButton
    lateinit var btn_tentang: ImageButton
    val sampleImage = intArrayOf(
        R.drawable.jembatan,
        R.drawable.pulau,
        R.drawable.kayu,
        R.drawable.museum,
        R.drawable.ladaya,
        R.drawable.planet,
        R.drawable.tgr,
        R.drawable.puncak

    )


    override fun onClick(v: View?) {
        when (v!!.id) {

            R.id.btn_about -> {
                activity?.supportFragmentManager?.beginTransaction()
                    ?.replace(R.id.container, about())?.commit()

            }
            R.id.btn_profil -> {
                activity?.supportFragmentManager?.beginTransaction()
                    ?.replace(R.id.container, profilobjek())?.commit()

            }
            R.id.btn_galeri -> {
                activity?.supportFragmentManager?.beginTransaction()
                    ?.replace(R.id.container, galeriwisata())?.commit()
            }
            R.id.btn_portal -> {
                activity?.supportFragmentManager?.beginTransaction()
                    ?.replace(R.id.container, website())?.commit()
            }
            R.id.btn_video -> {
                var i: Intent
                i = Intent(activity, videowisata::class.java)
                startActivity(i)
            }
            R.id.btn_lokasi -> {
                activity?.supportFragmentManager?.beginTransaction()
                    ?.replace(R.id.container, peta())?.commit()

            }
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        activity?.setTitle("WISATA TENGGAROG")
        val view: View
        view = inflater.inflate(R.layout.activity_home, null)
        carouselView = view.findViewById(R.id.carouselView)
        carouselView.setPageCount(8)
        carouselView.setImageListener(imageListener)

        carouselView.setImageClickListener { position ->
            if (position == 0) {
                val intent = Intent(activity, detailobjek::class.java)
                intent.putExtra("Title", "jembatan repo-repo")
                intent.putExtra("URL", "https://goo.gl/maps/jTHzceqWMv6nZUDt6")
                intent.putExtra("Detail", getString(R.string.jembatan))
                startActivity(intent)
            }
            if (position == 1) {
                val intent = Intent(activity, detailobjek::class.java)
                intent.putExtra("Title", "pulau kumala")
                intent.putExtra("URL", "https://goo.gl/maps/y5s6LxsedzUyS8ju6")
                intent.putExtra("Detail", getString(R.string.pulau))
                startActivity(intent)
            }
            if (position == 2) {
                val intent = Intent(activity, detailobjek::class.java)
                intent.putExtra("Title", "museum kayu")
                intent.putExtra("URL", "https://goo.gl/maps/8svdLnBDFbiyrPUBA")
                intent.putExtra("Detail", getString(R.string.museumkayu))
                startActivity(intent)
            }

            if (position == 3) {
                val intent = Intent(activity, detailobjek::class.java)
                intent.putExtra("Title", "museum mulawarman")
                intent.putExtra("URL", "https://goo.gl/maps/VuQ5DcVBZzsdR3Z59")
                intent.putExtra("Detail", getString(R.string.museum_tgr))
                startActivity(intent)
            }
            if (position == 4) {
                val intent = Intent(activity, detailobjek::class.java)
                intent.putExtra("Title", "ladaya")
                intent.putExtra("URL", "https://goo.gl/maps/7aa4jd2PiM73BBUr9")
                intent.putExtra("Detail", getString(R.string.ladaya))
                startActivity(intent)
            }
            if (position == 5) {
                val intent = Intent(activity, detailobjek::class.java)
                intent.putExtra("Title", "planetarium")
                intent.putExtra("URL", "https://goo.gl/maps/Xje9J9PyKDPZYoM48")
                intent.putExtra("Detail", getString(R.string.planet))
                startActivity(intent)
            }
            if (position == 6) {
                val intent = Intent(activity, detailobjek::class.java)
                intent.putExtra("Title", "taman bawah jembatan")
                intent.putExtra("URL", "https://goo.gl/maps/SejZ3hH2f1N679gB9")
                intent.putExtra("Detail", getString(R.string.jembatan_))
                startActivity(intent)
            }
            if (position == 7) {
                val intent = Intent(activity, detailobjek::class.java)
                intent.putExtra("Title", "puncak bukit biru")
                intent.putExtra("URL", "https://goo.gl/maps/T7Uo2FVJntKNjUu1A")
                intent.putExtra("Detail", getString(R.string.pucak_))
                startActivity(intent)
            }

        }
        return view

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        btn_profile = view.findViewById(R.id.btn_profil)
        btn_lokasi = view.findViewById(R.id.btn_lokasi)
        btn_video = view.findViewById(R.id.btn_video)
        btn_web = view.findViewById(R.id.btn_portal)
        btn_galeri = view.findViewById(R.id.btn_galeri)
        btn_tentang = view.findViewById(R.id.btn_about)

        btn_profile.setOnClickListener(this)
        btn_lokasi.setOnClickListener(this)
        btn_web.setOnClickListener(this)
        btn_video.setOnClickListener(this)
        btn_galeri.setOnClickListener(this)
        btn_tentang.setOnClickListener(this)
    }

    var imageListener: ImageListener = object : ImageListener {
        override fun setImageForPosition(position: Int, imageView: ImageView) {
            Glide.with(this@home).load(sampleImage[position]).into(imageView)
        }
    }

}



