package com.androidmvi.spacex.splash

import android.os.Bundle
import com.androidmvi.spacex.R
import com.androidmvi.spacex.ui.base.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SplashActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.base_activity)
        setStatusBarColor(R.color.black)
        loadFragment(SplashFragment.getInstance(), true)
    }
}