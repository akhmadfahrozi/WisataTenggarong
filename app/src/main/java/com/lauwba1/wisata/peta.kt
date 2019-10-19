package com.lauwba1.wisata

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class peta : Fragment(), OnMapReadyCallback, View.OnClickListener {
    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.normal -> {
                map.mapType = GoogleMap.MAP_TYPE_NORMAL
            }
            R.id.satelit -> {
                map.mapType = GoogleMap.MAP_TYPE_SATELLITE
            }
            R.id.hybrid -> {
                map.mapType = GoogleMap.MAP_TYPE_HYBRID
            }
            R.id.terrain -> {
                map.mapType = GoogleMap.MAP_TYPE_TERRAIN
            }

        }

    }

    override fun onMapReady(p0: GoogleMap?) {
        var pulau_kumala: LatLng
        var ladaya: LatLng
        var creativepark: LatLng
        var museum_mulawarman: LatLng
        var planetarium: LatLng
        var museum_kayu: LatLng
        var jembatan:LatLng
        var taman_kota:LatLng
        var puncak:LatLng
        map = p0!!
        pulau_kumala = LatLng(-0.4378962, 117.0009328)
        map.addMarker(MarkerOptions().position(pulau_kumala).title("pulau_kumala"))
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(pulau_kumala, 10F))
        ladaya = LatLng(-0.3907298, 116.9776070)
        map.addMarker(MarkerOptions().position(ladaya).title("ladaya"))
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(ladaya, 10F))
        creativepark = LatLng(-0.4176682, 116.9917721)
        map.addMarker(MarkerOptions().position(creativepark).title("creativepark"))
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(creativepark, 10F))
        museum_mulawarman = LatLng(-0.413275, 116.990423)
        map.addMarker(MarkerOptions().position(museum_mulawarman).title("museum_mulawarman"))
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(museum_mulawarman, 10F))
        planetarium = LatLng(-0.4121913, 116.9904246)
        map.addMarker(MarkerOptions().position(planetarium).title("planetarium"))
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(planetarium, 10F))
        museum_kayu = LatLng(-0.405961, 116.971393)
        map.addMarker(MarkerOptions().position(museum_kayu).title("Museum kayu"))
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(museum_kayu, 10F))
        jembatan= LatLng(-0.423227, 116.993321)
        map.addMarker(MarkerOptions().position(jembatan).title("JEMBATAN REPO REPO"))
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(jembatan, 10F))
        taman_kota = LatLng(-0.443970, 117.000884)
        map.addMarker(MarkerOptions().position(taman_kota).title("TAMAN KOTA RAJA"))
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(taman_kota, 10F))
        puncak = LatLng(-0.496021, 116.985144)
        map.addMarker(MarkerOptions().position(puncak).title("WISATA PUNCAK BUKIT BIRU"))
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(puncak, 10F))
    }

    lateinit var map: GoogleMap
    lateinit var mp: SupportMapFragment
    lateinit var normal: Button
    lateinit var satelit: Button
    lateinit var hybird: Button
    lateinit var terrain: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.activity_peta, null);
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        mp = childFragmentManager.findFragmentById(R.id.mapFragment) as SupportMapFragment
        mp.getMapAsync(this)
        normal = view.findViewById(R.id.normal)
        satelit = view.findViewById(R.id.satelit)
        hybird = view.findViewById(R.id.hybrid)
        terrain = view.findViewById(R.id.terrain)

        normal.setOnClickListener(this)
        satelit.setOnClickListener(this)
        hybird.setOnClickListener(this)
        terrain.setOnClickListener(this)
    }
}