package com.lauwba1.wisata

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.widget.ProgressBar
import androidx.fragment.app.Fragment
import android.webkit.WebViewClient as WebViewClient1

class website :Fragment() {

    lateinit var webView: WebView
    lateinit var pb: ProgressBar
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.activity_website,null);
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        webView= view.findViewById(R.id.webview)
        pb= view.findViewById(R.id.pb)
             //MEMBUKA APLIKASI WEB DI APLIKASI SENDIRI
        webView.webViewClient=object : WebViewClient1(){
            override fun onPageFinished(view: WebView,url:String?){
                super.onPageFinished(view,url)
            }

        }
        webView.webChromeClient=object : WebChromeClient(){
            override fun onProgressChanged(view: WebView?, newProgress: Int) {
                super.onProgressChanged(view, newProgress)
                if(newProgress==100){pb.visibility= View.GONE}

            }
        }
        webView.loadUrl("https://www.kutaikartanegara.com/")    }

}