package com.example.loginui10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.example.loginui10.login.UI1.activity.LoginActivity1;
import com.example.loginui10.login.UI2.activity.LoginActivity2;

public class MainActivity extends AppCompatActivity {

    Button loginPage1, loginPage2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginPage1 = findViewById(R.id.login_page_but1);
        loginPage2 = findViewById(R.id.login_page_but2);

        loginPage1.setOnClickListener(v->{

            Intent i = new Intent(this, LoginActivity1.class);
            startActivity(i);
        });

        loginPage2.setOnClickListener(v->{

            Intent i = new Intent(this, LoginActivity2.class);
            startActivity(i);
        });

    }

}
