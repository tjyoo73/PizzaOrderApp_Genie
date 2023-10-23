package com.tjlab.pizzaorderapp_genie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tjlab.pizzaorderapp_genie.adapters.MainViewPagerAdapter
import com.tjlab.pizzaorderapp_genie.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mvpa : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {
        mvpa = MainViewPagerAdapter(supportFragmentManager)
        binding.mainViewPager.adapter = mvpa

        binding.mainTabLayout.setupWithViewPager(binding.mainViewPager)

    }

}