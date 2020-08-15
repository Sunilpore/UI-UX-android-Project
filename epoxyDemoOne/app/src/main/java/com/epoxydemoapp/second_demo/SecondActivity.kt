package com.epoxydemoapp.second_demo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.airbnb.epoxy.EpoxyController
import com.airbnb.epoxy.EpoxyRecyclerView
import com.epoxydemoapp.R
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)




        epoxyRecyclerview.buildModelsWith(object :EpoxyRecyclerView.ModelBuilderCallback{
            override fun buildModels(controller: EpoxyController) {

                val k = User.getSampleUsers()
                Log.d("TAG_EPOX2","user list: "+k.size)
                k.forEachIndexed{index, user ->

                    Log.d("TAG_EPOX3","user index: "+index+" \tuserName: "+user.name)

                    controller.userLayoutView {
                        id(index)
                        name(user.name)
                        age("${user.age}")
                        email(user.email)
                        itemClickListener {v ->
                            Toast.makeText(this@SecondActivity, "You clicked on item ${user.name}", Toast.LENGTH_SHORT).show()
                        }
                        if (index.rem(2)==0) background(Color.GREEN)
                    }

                }


            }
        })

        /*epoxyRecyclerview.buildModelsWith {
            it.apply {
                User.getSampleUsers()
                    .forEachIndexed { index, user ->
                        userLayoutView {
                            id(index)
                            name(user.name)
                            age("${user.age}")
                            email(user.email)
                            itemClickListener {_ ->
                                Toast.makeText(this@MainActivity,
                                    "You clicked on item ${user.name}",
                                    Toast.LENGTH_SHORT)
                                    .show()
                            }
                            if (index.rem(2)==0) background(Color.GREEN)
                        }
                    }
            }
        }*/


    }





}