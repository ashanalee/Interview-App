package com.example.lab2task1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class quizapp2 extends AppCompatActivity implements View.OnClickListener {
    Button simple,tough,seeapp,rateapp,find;
    TextView msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizapp2);

        msg  =(TextView) findViewById(R.id.wellname);

        simple = (Button) findViewById(R.id.simple);
        simple.setOnClickListener(this);

        tough = (Button) findViewById(R.id.tough);
        tough.setOnClickListener(this);

        seeapp = (Button) findViewById(R.id.app);
        seeapp.setOnClickListener(this);

        rateapp = (Button) findViewById(R.id.rateapp);
        rateapp.setOnClickListener(this);

        find = (Button) findViewById(R.id.findus);
        find.setOnClickListener(this);

        Intent j = getIntent();
        String name = j.getStringExtra("msg");
        msg.setText("Wellcome "+name);

    }

    @Override
    public void onClick(View view) {

    switch (view.getId())
    {

        case R.id.simple:
            Intent i = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(i);
            break;

        case R.id.tough:
            Intent j = new Intent(getApplicationContext(), tough.class);
            startActivity(j);
            break;

        case R.id.app:
            try{
                Uri uril = Uri.parse("https://play.google.com/store/apps/details?id=com.interview.qa.nxtech");
                Intent market1 = new Intent(Intent.ACTION_VIEW,uril);
                startActivity(market1);

            }catch(ActivityNotFoundException e){
            Uri uril = Uri.parse("https://play.google.com/store/apps/details?id=com.interview.qa.nxtech");
            Intent market1 = new Intent(Intent.ACTION_VIEW,uril);
            startActivity(market1);
        }
            break;

        case R.id.rateapp:
            try{
                Uri uril = Uri.parse("https://play.google.com/store/apps/details?id=com.interview.qa.nxtech");
                Intent market1 = new Intent(Intent.ACTION_VIEW,uril);
                startActivity(market1);

            }catch(ActivityNotFoundException e) {
                Uri uril = Uri.parse("https://play.google.com/store/apps/details?id=com.interview.qa.nxtech");
                Intent market1 = new Intent(Intent.ACTION_VIEW,uril);
                startActivity(market1);
            }
            break;

        case R.id.findus:
            Intent market1 = new Intent(Intent.ACTION_VIEW);
            market1.setData(Uri.parse("https://www.google.com/maps/@33.8374754,72.4330152,14z"));
            if(market1.resolveActivity(getPackageManager())!= null)
            {
                startActivity(market1);
            }
            else
            {
                Toast.makeText(getApplicationContext(),"No apps availible",Toast.LENGTH_SHORT).show();
            }

            break;
    }
    }
}