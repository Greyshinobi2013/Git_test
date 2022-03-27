package com.example.dogpics

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.example.dogpics.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

private lateinit var binding: ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController

        navHostFragment.findNavController().run {
            toolbar.setupWithNavController(this, AppBarConfiguration(graph))

        }

    }

}



