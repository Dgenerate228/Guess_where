package com.example.lesson_koltin_6_activity_navigation

import android.os.Bundle
import com.example.lesson_koltin_6_activity_navigation.databinding.ActivityAboutBinding


class AboutMenu : BaseActivity() {
    private lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater).also {setContentView(it.root)}

        binding.versionNameTextView.text = BuildConfig.VERSION_NAME
        binding.versionCodeTextView.text = BuildConfig.VERSION_CODE.toString()
        binding.okButton.setOnClickListener { onOkPressed() }
    }

    private fun onOkPressed() {
        finish()
    }

    }