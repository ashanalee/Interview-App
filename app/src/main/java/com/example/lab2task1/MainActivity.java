package com.example.lab2task1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView question,answer,total_length_yy,present_index_xx;
    Button next,previous,show;
    String[] simple_question,simple_answer;
    int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        question = (TextView) findViewById(R.id.question);
        answer = (TextView) findViewById(R.id.answer);
        total_length_yy = (TextView) findViewById(R.id.txtyy);
        present_index_xx = (TextView) findViewById(R.id.txtxx);

        next = (Button) findViewById(R.id.next);
        next.setOnClickListener(this);
        show = (Button) findViewById(R.id.answr);
        show.setOnClickListener(this);
        previous = (Button) findViewById(R.id.previous);
        previous.setOnClickListener(this);

        simple_question = getResources().getStringArray(R.array.simple_que);
        simple_answer = getResources().getStringArray(R.array.simple_ans);

        index = 0;
        question.setText(String.valueOf("Q)") +simple_question[0]);
        answer.setText("Press \"A\" Button for the answer.");
        present_index_xx.setText(String.valueOf(index+1));
        total_length_yy.setText("/"+ String.valueOf(simple_question.length));

    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.previous:
                if(index < 0)
                {
                    Toast.makeText(getApplicationContext(),"No question availible.",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    answer.setText("Press \"A\" Button for the answer.");
                    index--;
                    question.setText(String.valueOf("Q)")+simple_question[index]);
                    present_index_xx.setText(String.valueOf(index+1));
                }

                break;

            case R.id.next:
                if(index > simple_question.length)
                {
                    Toast.makeText(getApplicationContext(),"Question Completed.",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    answer.setText("Press \"A\" Button for the answer.");
                    index++;
                    question.setText(String.valueOf("Q)")+simple_question[index]);
                    present_index_xx.setText(String.valueOf(index+1));
                }
                break;

            case R.id.answr:
                answer.setText(String.valueOf("Ans)")+simple_answer[index]);
                break;

        }
    }
}