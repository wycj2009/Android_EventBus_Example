package com.example.android_eventbus_example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android_eventbus_example.databinding.ActivityMainBinding
import org.greenrobot.eventbus.EventBus

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().replace(binding.frame.id, BlankFragment()).commit()

        binding.postEvent.setOnClickListener {
            EventBus.getDefault().post(MessageEvent("message!"))
        }
    }
}
