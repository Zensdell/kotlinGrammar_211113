package com.nepplus.kotlingrammar_211113

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnVariable.setOnClickListener {

 //            이 안에 적는 코드 - 변수 문법 연습 01

            var myName : String

            myName ="구영모"
            myName = "김영모"

            Log.d("문법연습01", myName)

            val friendName : String
            friendName = "김갑생할머니"
//            friendName = "갑돌이" 여기는 주석이니까 아무말 적어도 됨 ctrl + /
            Log.d("문법연습",friendName)

        }

    }
}