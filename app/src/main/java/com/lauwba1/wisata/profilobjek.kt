package com.lauwba1.wisata

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.synnapps.carouselview.CarouselView
import com.synnapps.carouselview.ImageListener

class profilobjek : Fragment() {

    lateinit var carouselView: CarouselView

    val sampleImages = intArrayOf(
        R.drawable.ladaya,
        R.drawable.pulau,
        R.drawable.kayu,
        R.drawable.jembatan1,
        R.drawable.planet,
        R.drawable.museum,
        R.drawable.tgr,
        R.drawable.puncak


    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        activity?.setTitle("Wisata Tenggarong")
        val view: View
        view = inflater.inflate(R.layout.activity_profilobjek, null)
        carouselView = view.findViewById(R.id.carouselView)
        carouselView.setPageCount(8)
        carouselView.setImageListener(imageListener)
        return view
    }

    var imageListener: ImageListener = object : ImageListener {
        override fun setImageForPosition(position: Int, imageView: ImageView) {
            Glide.with(this@profilobjek).load(sampleImages[position]).into(imageView)
        }
    }

}