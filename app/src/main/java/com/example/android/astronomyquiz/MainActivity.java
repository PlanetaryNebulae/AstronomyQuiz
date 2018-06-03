package com.example.android.astronomyquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkAnswer(View view) {

        /**
         * This int is the final grade.
         */
        int gradeResults = 0;

        /**
         * This is to check if answer to question 1 is correct.
         */
        EditText tachyonAnswer = findViewById(R.id.tachyon_answer);
        String userAnswerEntered = tachyonAnswer.getText().toString().toUpperCase().trim();
        if (userAnswerEntered.equalsIgnoreCase("tachyon"))
            gradeResults = gradeResults + 20;

        /**
         * This is to check if the answer to question 2 is correct.
         */
        RadioButton questionTwoAnswer = findViewById(R.id.two_thousand_fifteen);
        if (questionTwoAnswer.isChecked()) {
            gradeResults = gradeResults + 20;
        }

        /**
         * This is to check the answers for question 3.
         */
        CheckBox questionThreeA = findViewById(R.id.helix_nebula_check_box);
        if (questionThreeA.isChecked()) {
            gradeResults = gradeResults + 10;
        }

        CheckBox questionThreeB = findViewById(R.id.cats_eye_check_box);
        if (questionThreeB.isChecked()) {
            gradeResults = gradeResults + 10;
        }

        /**
         * This is to check if the answer to question 4 is correct.
         */
        RadioButton questionFourAnswer = findViewById(R.id.canis_major_radio_button);
        if (questionFourAnswer.isChecked()) {
            gradeResults = gradeResults + 20;
        }

        /**
         * This is to check the answers for question 5.
         */
        CheckBox questionFiveA = findViewById(R.id.ceres_check_box);
        if (questionFiveA.isChecked()) {
            gradeResults = gradeResults + 5;
        }

        CheckBox questionFiveB = findViewById(R.id.makemake_check_box);
        if (questionFiveB.isChecked()) {
            gradeResults = gradeResults + 5;
        }

        CheckBox questionFiveC = findViewById(R.id.pluto_check_box);
        if (questionFiveC.isChecked()) {
            gradeResults = gradeResults + 5;
        }

        CheckBox questionFiveD = findViewById(R.id.haumea_check_box);
        if (questionFiveD.isChecked()) {
            gradeResults = gradeResults + 5;
        }

        /**
         * This is to return the gradeResults.
         */
        Toast.makeText(this, "Your grade is " + gradeResults + "%", Toast.LENGTH_LONG).show();
    }

}
