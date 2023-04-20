package com.example.lab2task1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class quizapp1 extends AppCompatActivity implements View.OnClickListener {
    TextView name;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizapp1);

        name = (TextView) findViewById(R.id.name);
        next = (Button) findViewById(R.id.nextbutton);
        next.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        switch(view.getId())
        {
            case R.id.nextbutton:

            Intent i = new Intent(getApplicationContext(), quizapp2.class);
            i.putExtra("msg",name.getText().toString());
            startActivity(i);
        }
    }

}