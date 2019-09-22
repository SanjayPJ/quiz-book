package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int correct_answer = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void check_all(View view){
        Boolean is_q1_opt1_checked = ((RadioButton) findViewById(R.id.qRadOne)).isChecked();
        Boolean is_q2_opt2_checked = ((RadioButton) findViewById(R.id.q2RadTwo)).isChecked();

        Boolean is_q3_opt1_checked = ((CheckBox) findViewById(R.id.q3CheckOne)).isChecked();
        Boolean is_q3_opt2_checked = ((CheckBox) findViewById(R.id.q3CheckTwo)).isChecked();
        Boolean is_q3_opt3_checked = ((CheckBox) findViewById(R.id.q3CheckThree)).isChecked();

        Boolean is_q4_opt1_checked = ((CheckBox) findViewById(R.id.q4CheckOne)).isChecked();
        Boolean is_q4_opt2_checked = ((CheckBox) findViewById(R.id.q4CheckTwo)).isChecked();
        Boolean is_q4_opt3_checked = ((CheckBox) findViewById(R.id.q4CheckThree)).isChecked();


        EditText q5EditText = (EditText) findViewById(R.id.q5EditText);
        String q5EditText_text = q5EditText.getText().toString();


        if(is_q1_opt1_checked){
            correct_answer++;
        }

        if(is_q2_opt2_checked){
            correct_answer++;
        }

        if(is_q3_opt1_checked && !is_q3_opt2_checked && is_q3_opt3_checked){
            correct_answer++;
        }

        if(!is_q4_opt1_checked && is_q4_opt2_checked && is_q4_opt3_checked){
            correct_answer++;
        }

        if(q5EditText_text.trim().equalsIgnoreCase("everest")){
            correct_answer++;
        }

        Toast.makeText(this, "Correct Answers: " + correct_answer + "/5", Toast.LENGTH_SHORT).show();

        correct_answer = 0;
    }
}
