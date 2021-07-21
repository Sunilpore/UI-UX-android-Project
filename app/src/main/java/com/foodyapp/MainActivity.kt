package com.foodyapp



import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp

@ExperimentalUnitApi
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        setContent {

            LazyColumn(

                modifier = Modifier
                    .background(
                    color = Color(0x4DCDCED1)
                )
            ) {

                item {

                    Image(bitmap = ImageBitmap.imageResource(id = R.drawable.happy_meal) ,
                        contentDescription = "",
                        modifier = Modifier.height(300.dp),
                        contentScale = ContentScale.Crop)

                    Column(
                        modifier = Modifier.padding(16.dp)
                    ) {
                        Text(text = "Happy Meal",
                            style = TextStyle(
                                fontSize = TextUnit(24.0f, TextUnitType.Sp)
                            )
                        )

                        Spacer(modifier = Modifier.padding(top = 10.dp))
                        Text(text = "800 Calories",
                            style = TextStyle(
                                color = Color(0xFF2B315A),
                                fontSize = TextUnit(16.0f,TextUnitType.Sp))
                        )

                        Spacer(modifier = Modifier.padding(top = 10.dp))
                        Text(text = "Rs. 40",
                            style = TextStyle(
                                color = Color(0xFF0EA214),
                                fontSize = TextUnit(14.0f,TextUnitType.Sp)))
                    }

                }
            }

        }

    }


}