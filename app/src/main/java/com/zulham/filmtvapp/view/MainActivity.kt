package com.zulham.filmtvapp.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.zulham.filmtvapp.R
import com.zulham.filmtvapp.adapter.PagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sectionsPagerAdapter = PagerAdapter(this, supportFragmentManager)
        VPList.adapter = sectionsPagerAdapter
        tabLayout.setupWithViewPager(VPList)

    }

}