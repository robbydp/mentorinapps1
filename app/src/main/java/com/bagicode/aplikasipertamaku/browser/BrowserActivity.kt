package com.bagicode.aplikasipertamaku.browser

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bagicode.aplikasipertamaku.databinding.ActivityBrowserBinding

class BrowserActivity : AppCompatActivity() {

    private lateinit var binding : ActivityBrowserBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBrowserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.wvBrowser.loadUrl("https://www.google.com/")
        binding.wvBrowser.settings.javaScriptEnabled
    }
}