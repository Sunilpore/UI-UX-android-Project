package com.epoxydemoapp.second_demo

import android.util.Log
import kotlin.random.Random

data class User (
    val name:String,
    val email:String,
    var age:Int
) {
    companion object{
        fun getSampleUsers():MutableList<User>{
            val usersList:MutableList<User> = mutableListOf()
            for (i in 1..50) {
                usersList.add(User(name = "User $i",email = "user$i@email.com",age = Random.nextInt(18,50)))
            }
            Log.d("TAG_EPOX","user list: "+usersList.size)
            return usersList
        }
    }
}