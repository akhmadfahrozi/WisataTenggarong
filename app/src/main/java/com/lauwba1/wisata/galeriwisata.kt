package com.lauwba1.wisata

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class galeriwisata : Fragment() {

    lateinit var recyclerView: RecyclerView
    lateinit var lm: RecyclerView.LayoutManager
    lateinit var adapter: galeriadapter
    val url = arrayOf(
        "https://wisatalengkap.com/wp-content/uploads/2017/03/ladaya-tenggarong-.jpg",
        "http://tunawisma.com/wp-content/uploads/2017/02/05B_Kutai.jpg",
        "https://images1.prokal.co/webkp/file/berita/2017/06/28/wisata-pulau-kumala-masih-ada.jpg",
        "http://1.bp.blogspot.com/-tsVBV9CND-0/Unsk5paW1cI/AAAAAAAACSk/xrjVTM-rRrc/s1600/BeFunky_2011_01110095.jpg.jpg",
        "https://humas.kukarkab.go.id/images/gallery_news/1807778691533b6931e42ca.humas_kukar_foto___museum_mulawarman___okta_vianus.jpg",
        "https://bombasticborneo.com/wp-content/uploads/2017/09/Museum-Kayu-Tuah-Himba-Kutai-Kartanegara-Tenggarong.jpg",
        "http://foto.data.kemdikbud.go.id/getImage/MS000418/7.jpg",
        "https://www.1news.id/wp-content/uploads/2016/05/tmp_15547-Screenshot_2016-03-22-15-14-192283808221.png",
        "http://djehanprakoso.it.student.pens.ac.id/Gambar/tenggarong/tepian-tenggarong1.jpg",
        "http://www.familygoers.com/wp-content/uploads/2019/08/IMG_20190830_205724-1024x583.jpg",
        "https://www.indonesiakaya.com/uploads/_images_gallery/IMG_3268_Melalui_proyektor_khusus,_pengunjung_dapat_menyaksikan_proyeksi_berbagai_benda_langit_dalam_pertunjukan_atraktif.jpg"

    )



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.activity_galeriwisata, null)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView=view.findViewById(R.id.recyclerviewgaleri)
        recyclerView.setHasFixedSize(true)
        lm = GridLayoutManager(context,1)
        recyclerView.layoutManager = lm
        adapter=galeriadapter(url,this.context!!)
        recyclerView.adapter=adapter
    }

}

