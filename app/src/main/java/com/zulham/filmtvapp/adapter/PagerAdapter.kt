package com.zulham.filmtvapp.adapter

import android.content.Context
import android.os.Bundle
import androidx.annotation.Nullable
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.zulham.filmtvapp.R
import com.zulham.filmtvapp.view.FilmFragment
import com.zulham.filmtvapp.view.TVFragment

class PagerAdapter(private val mContext: Context, fragmentManager: FragmentManager) :
    FragmentPagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    @StringRes
    private val TAB_TITLES = intArrayOf(R.string.film, R.string.tv)

    override fun getCount(): Int {
        return TAB_TITLES.size
    }

    override fun getItem(position: Int): Fragment {
        var fragment: Fragment? = null

        when (position) {
            0 -> fragment = FilmFragment()
            1 -> fragment = TVFragment()
        }
        return fragment as Fragment
    }

    @Nullable
    override fun getPageTitle(position: Int): CharSequence? {
        return mContext.resources.getString(TAB_TITLES[position])
    }
}