package com.lauwba1.wisata

import android.content.Intent
import android.os.Bundle
import com.google.android.material.navigation.NavigationView
import androidx.appcompat.app.AppCompatActivity
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AlertDialog
import androidx.core.view.GravityCompat
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    lateinit var fm: FragmentManager
    lateinit var ft: FragmentTransaction
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toggle = ActionBarDrawerToggle(
            this,
            drawer_layout,
            toolbar,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_clos
        )
        fm = supportFragmentManager
        ft = fm.beginTransaction()
        ft.replace(R.id.container, home()).commit()

        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }


    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.home -> {
                fm = supportFragmentManager
                ft = fm.beginTransaction()
                ft.replace(R.id.container, home()).commit()


            }

            R.id.map -> {
                fm = supportFragmentManager
                ft = fm.beginTransaction()
                ft.replace(R.id.container, peta()).commit()

            }

            R.id.gallery -> { fm = supportFragmentManager
                ft = fm.beginTransaction()
                ft.replace(R.id.container, galeriwisata()).commit()

            }
            R.id.webview -> {
                fm = supportFragmentManager
                ft = fm.beginTransaction()
                ft.replace(R.id.container, website()).commit()


            }


            R.id.video -> {
                var i : Intent
                i = Intent(this@MainActivity,videowisata::class.java)
                startActivity(i)

            }
            R.id.tentang_pengembang -> {
                fm = supportFragmentManager
                ft = fm.beginTransaction()
                ft.replace(R.id.container, about()).commit()

            }
            R.id.exit -> {
                AlertDialog.Builder(this@MainActivity)
                    // Judul
                    .setTitle("Alert Dialog Title")
                    // Pesan yang di tamopilkan
                    .setMessage("APAKAH ANDA INGIN KELUAR")
                    .setIcon(android.R.drawable.ic_lock_power_off)
                    .setPositiveButton("YA",{_,_->finish()})
                    .setNegativeButton("TIDAK",null)
                    .show()
            }
        }


        drawer_layout.closeDrawer(GravityCompat.START)
        return true

    }


}



