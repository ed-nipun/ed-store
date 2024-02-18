package com.example.edstore.util

import androidx.fragment.app.Fragment
import com.example.edstore.R
import com.example.edstore.activities.ShoppingActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

fun Fragment.hideBottomNavigationView(){
    val bottomNavigationView =
        (activity as ShoppingActivity).findViewById<BottomNavigationView>(
            com.example.edstore.R.id.bottomNavigation
        )
    bottomNavigationView.visibility = android.view.View.GONE
}

fun Fragment.showBottomNavigationView(){
    val bottomNavigationView =
        (activity as ShoppingActivity).findViewById<BottomNavigationView>(
            com.example.edstore.R.id.bottomNavigation
        )
    bottomNavigationView.visibility = android.view.View.VISIBLE
}