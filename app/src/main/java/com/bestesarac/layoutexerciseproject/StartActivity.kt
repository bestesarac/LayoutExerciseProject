package com.bestesarac.layoutexerciseproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.bestesarac.layoutexerciseproject.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding:ActivityStartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_start)
        //setContentView(R.layout.activity_start)

        binding.button2.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        val intent:Intent = Intent(this,PaymentActivity::class.java)
        startActivity(intent)

    }
}