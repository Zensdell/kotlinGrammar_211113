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

        btnVariable02.setOnClickListener {
        //     변수 연습 02
            var myName = "구영모"
            val myBirthYear = 1990
            var myHeight = 185.5

            myHeight = 180.2

            Log.d("변수연습02",myName )

        }

        btnCondition01.setOnClickListener {
//            조건문 01 버튼이 눌리면 실행 될 코드

            val userAge = 12

//            나이가 20살 이상인가? -> 로그로 "성인입니다." 문장 출력
            if(userAge>=20) {
                Log.d("조건문01","성인입니다")
            }
            else if (userAge >= 17) {
                Log.d("조건문01","고딩입니당")
            }
            else if (userAge>=14) {
                Log.d("조건문01","중딩입니당")
            }
            else {
                Log.d("조건문01","초등학생이거나, 미취학 아동이에요")
            }

        }

        btnCondition02.setOnClickListener {

//            논리 연산자 체험

//            고연봉, 가까운 거리, 야근없음

//            A 회사의 조건
            val companyASalarly = 3000
            val companyADistance = 50
            val companyAEarlyoff = true

//            1번 구직자는 취업 의사?
//            조건 : 연봉 4천 이상이면 OK
            val person01OK = companyASalarly >= 4000

            Log.d("조건문02",person01OK.toString())

//            2번 구직자
//            조건 : 이동시간이 30분 이내 or 빨리 퇴근

            val person02OK = (companyADistance <=30) || (companyAEarlyoff)

//            Bool변수 = "true"는 할 필요가 없는 질문.
//            Bool 변수 안에 있는 값을 그대로 꺼내쓰면, == true와 항상 같은 결과.

            Log.d("조건문02", person02OK.toString())

//            3번 구직자
//            조건 : 빨리 퇴근안하는 회사 -> NOT 연산

            val person03ok = !companyAEarlyoff
            Log.d("조건문02", person03ok.toString())
        }

    }
}