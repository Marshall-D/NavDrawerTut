package com.example.naviationdrawertut

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.navigation.NavigationView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.naviationdrawertut.databinding.ActivityMain2Binding

class Main2Activity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMain2Binding
    private val navController = findNavController(R.id.nav_host_fragment_content_main2)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.appBarMain2.toolbar)

        binding.appBarMain2.fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navView: NavigationView = binding.navView
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)


    }

    navController.addOnDestinationChangedListener { _, destination, _ ->


        when (destination.id) {
            R.id.nav_home -> {
                Log.i("home", "Sign out clicked!")

                Toast.makeText(this, "home", Toast.LENGTH_LONG).show()
            }
            R.id.nav_gallery -> {
                Log.i("gallery", "Sign out clicked!")

                Toast.makeText(this, "galleery", Toast.LENGTH_LONG).show()
            }
            R.id.nav_slideshow -> {
                Log.i("slideshow", "Sign out clicked!")

                Toast.makeText(this, "SARE", Toast.LENGTH_LONG).show()

            }

        }

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main2, menu)
        return true
    }
    navController.addOnDestinationChangedListener { _, destination, _ ->


        when (destination.id) {
            R.id.nav_home -> {
                Log.i("home", "Sign out clicked!")

                Toast.makeText(this, "home", Toast.LENGTH_LONG).show()
            }
            R.id.nav_gallery -> {
                Log.i("gallery", "Sign out clicked!")

                Toast.makeText(this, "galleery", Toast.LENGTH_LONG).show()
            }
            R.id.nav_slideshow -> {
                Log.i("slideshow", "Sign out clicked!")

                Toast.makeText(this, "SARE", Toast.LENGTH_LONG).show()

            }

        }

    }


    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main2)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
}