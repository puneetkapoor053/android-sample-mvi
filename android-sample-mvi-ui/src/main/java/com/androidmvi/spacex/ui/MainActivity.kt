package com.androidmvi.spacex.ui

import android.os.Bundle
import com.androidmvi.spacex.ui.base.BaseActivity
import com.androidmvi.spacex.ui.fragments.RocketListFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.base_activity)
        loadFragment(RocketListFragment.getInstance(), false)
    }
}