package com.lauwba1.wisata

import android.content.pm.ActivityInfo
import android.os.Bundle
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import com.google.android.youtube.player.YouTubePlayerView

class videowisata : YouTubeBaseActivity(), YouTubePlayer.OnInitializedListener {

    lateinit var yb: YouTubePlayerView

    override fun onCreate(p0: Bundle?) { super.onCreate(p0)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
        setContentView(R.layout.activity_videowisata)
        yb = findViewById(R.id.youtubeplayer)
        yb.initialize("AIzaSyC0r-6GaGL7AOHmOI8mlKnnN4KaK2WM67c", this)
    }

    override fun onInitializationSuccess(

        p0: YouTubePlayer.Provider?,
        p1: YouTubePlayer?,
        p2: Boolean
    ) {
        p1!!.setFullscreen(true)
        p1.cueVideo("XD0tWNG_ZOg")
        p1.play()

    }

    override fun onInitializationFailure(
        p0: YouTubePlayer.Provider?,
        p1: YouTubeInitializationResult?
    ) {
        if (p1!!.isUserRecoverableError) {
            p1.getErrorDialog(this, 1).show()
        }
    }
}