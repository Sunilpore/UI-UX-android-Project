package com.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class LoginActivity extends AppCompatActivity {

    AutoCompleteTextView tvSelector;
    TextView tvOne;

    List<String> selectionMdlList;

    public static final String TAG = "login_act_tag";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tvSelector = findViewById(R.id.ed_model_type);
        tvOne =findViewById(R.id.txt_vw_one);

        selectionMdlList = new ArrayList<>();
        selectionMdlList.add("one");
        selectionMdlList.add("two");

        ArrayAdapter selectionAdapter = new ArrayAdapter(this, R.layout.dropdown_menu_popup_item,selectionMdlList);

        tvSelector.setThreshold(1);
        tvSelector.setAdapter(selectionAdapter);

        tvSelector.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(this, ""+selectionMdlList.get(position), Toast.LENGTH_SHORT).show();
        });


    }

}
