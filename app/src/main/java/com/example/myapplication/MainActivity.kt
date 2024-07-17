package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private var btn: Button? = null
    private var btn1: Button? = null
    private var btn2: Button? = null
    private var btn3: Button? = null
    private var btn4: Button? = null
    private var text: TextView? = null

    private var num=0.0f
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_project2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btn=findViewById(R.id.Next)
        btn1=findViewById(R.id.btadd)
        btn2=findViewById(R.id.btsub)
        btn3=findViewById(R.id.btdiv)
        btn4=findViewById(R.id.btmul)
        text=findViewById(R.id.text)

        btn1?.setOnClickListener{
            num+=2
            text?.text = num.toString()
    }


        btn2?.setOnClickListener{
            num-=2
            if(num<0){
                num=0.0f
            }

            text?.text = num.toString()
        }
        btn3?.setOnClickListener{
            num/=2
            text?.text = num.toString()
        }
        btn4?.setOnClickListener{
            num*=num
            text?.text = num.toString()
        }

        btn?.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}