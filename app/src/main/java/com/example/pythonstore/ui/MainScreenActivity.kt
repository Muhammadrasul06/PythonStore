package com.example.pythonstore.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.pythonstore.R
import com.example.pythonstore.databinding.ActivityMainScreenBinding

class MainScreenActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainScreenBinding
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Delete background for BottomAppBar
        binding.navView.background=null

        //Intent for BottomNavigation
        navController = findNavController(R.id.nav_host_fragment_activity_main)
        binding.navView.setupWithNavController(navController)

        binding.fab.setOnClickListener {
            binding.navView.menu.hasVisibleItems()
        }
    }
}