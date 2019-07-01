package com.gamecodeschool.intentextras;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class receiveractivity extends AppCompatActivity {
        TextView tvname;
        TextView tvAge;
        String names;
        String ages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiveractivity);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       tvname = findViewById(R.id.tvName);
       tvAge = findViewById(R.id.tvAge);
       Bundle extras = getIntent().getExtras();
       if(extras!=null){
           String name = extras.getString("etname");
            String age = extras.getString("etage");
            tvname.setText(name);
            tvAge.setText(age);


        }
    }

}
