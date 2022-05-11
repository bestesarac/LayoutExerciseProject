package com.bestesarac.layoutexerciseproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.bestesarac.layoutexerciseproject.databinding.ActivityPaymentBinding

class PaymentActivity : AppCompatActivity() , View.OnClickListener {
    private lateinit var binding: ActivityPaymentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_payment)
        //setContentView(R.layout.activity_payment)

        binding.button3.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        val intent:Intent = Intent(this,MainActivity::class.java)
        startActivity(intent)

    }
}