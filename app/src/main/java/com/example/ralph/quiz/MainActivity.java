package com.example.ralph.quiz;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


/**
 * This app displays a travel quiz app that could be taken by a user and calculates all correct answers.
 * Clicking SUBMIT will show how many questions the user answers correctly.
 */

public class MainActivity extends AppCompatActivity {
    /**
     * Initialize current score for user to 0.
     */
    int score = 0;

    /**
     * Initialize all Radio Buttons, Check Boxes, and Edit Text fields for all correct answers
     * and user name input.
     */
    private EditText nameField;

    private RadioButton question1Answer1b;
    private RadioButton question2Answer2d;
    private RadioButton question3Answer3a;

    private EditText question4Answer;

    private RadioButton question5Answer5d;

    private CheckBox question6AnswerBox1;
    private CheckBox question6AnswerBox2;
    private CheckBox question6AnswerBox3;
    private CheckBox question6AnswerBox4;
    private CheckBox question6AnswerBox5;
    private CheckBox question6AnswerBox6;

    private RadioButton question7Answer7d;

    private EditText question8Answer;

    private RadioButton question9Answer9b;

    private CheckBox question10AnswerBox1;
    private CheckBox question10AnswerBox2;
    private CheckBox question10AnswerBox3;
    private CheckBox question10AnswerBox4;
    private CheckBox question10AnswerBox5;

    /**
     * Declare all ViewById global variables to be used.
     */
    private void assignFindViews() {

        nameField = findViewById(R.id.name_field);

        question1Answer1b = findViewById(R.id.quest1_radio_button_b);

        question2Answer2d = findViewById(R.id.quest2_radio_button_d);

        question3Answer3a = findViewById(R.id.quest3_radio_button_a);

        question4Answer = findViewById(R.id.quest4_answer_text);

        question5Answer5d = findViewById(R.id.quest5_radio_button_d);

        question6AnswerBox1 = findViewById(R.id.quest6_checkbox_1);
        question6AnswerBox2 = findViewById(R.id.quest6_checkbox_2);
        question6AnswerBox3 = findViewById(R.id.quest6_checkbox_3);
        question6AnswerBox4 = findViewById(R.id.quest6_checkbox_4);
        question6AnswerBox5 = findViewById(R.id.quest6_checkbox_5);
        question6AnswerBox6 = findViewById(R.id.quest6_checkbox_6);

        question7Answer7d = findViewById(R.id.quest7_radio_button_d);

        question8Answer = findViewById(R.id.quest8_answer_text);

        question9Answer9b = findViewById(R.id.quest9_radio_button_b);

        question10AnswerBox1 = findViewById(R.id.quest10_checkbox_1);
        question10AnswerBox2 = findViewById(R.id.quest10_checkbox_2);
        question10AnswerBox3 = findViewById(R.id.quest10_checkbox_3);
        question10AnswerBox4 = findViewById(R.id.quest10_checkbox_4);
        question10AnswerBox5 = findViewById(R.id.quest10_checkbox_5);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        assignFindViews();
    }

    /**
     * This method calculates the score when user clicks the Submit button.
     */
    public void CheckAnswers(View view) {

        /**
         * This method checks answer for Question 1.
         */
        if (question1Answer1b.isChecked()) {
            score = score + 1;
        }

        /**
         * This method checks answer for Question 2.
         */
        if (question2Answer2d.isChecked()) {
            score = score + 1;
        }

        /**
         * This method checks answer for Question 3.
         */
        if (question3Answer3a.isChecked()) {
            score = score + 1;
        }

        /**
         * This method checks answer for Question 4.
         */
        String answer4 = question4Answer.getText().toString();
        if (answer4.equalsIgnoreCase("Hobbit")) {
            score = score + 1;
        }

        /**
         * This method checks answer for Question 5.
         */
        if (question5Answer5d.isChecked()) {
            score = score + 1;
        }

        /**
         * This method checks answer for Question 6.
         * CheckBoxes 1,3,4 and 6 are the correct answers.
         */
        if (question6AnswerBox1.isChecked() && question6AnswerBox3.isChecked() &&
                question6AnswerBox4.isChecked() && question6AnswerBox6.isChecked() &&
                !question6AnswerBox2.isChecked() && !question6AnswerBox5.isChecked()) {
            score = score + 1;
        }

        /**
         * This method checks answer for Question 7.
         */
        if (question7Answer7d.isChecked()) {
            score = score + 1;
        }

        /**
         * This method checks answer for Question 8.
         */
        String answer8 = question8Answer.getText().toString();
        if (answer8.equalsIgnoreCase("South America")) {
            score = score + 1;
        }

        /**
         * This method checks answer for Question 9.
         */
        if (question9Answer9b.isChecked()) {
            score = score + 1;
        }

        /**
         * This method checks answer for Question 10.
         * CheckBoxes 2 and 4 are the correct answers.
         */
        if (question10AnswerBox2.isChecked() && question10AnswerBox4.isChecked() &&
                !question10AnswerBox1.isChecked() && !question10AnswerBox3.isChecked() &&
                !question10AnswerBox5.isChecked() ) {
            score = score + 1;
        }

        /**
         * Display the user's final score using the Resources instance.
         * Toast message displays results depending on user's score using the following metrics:
         * lowScore = 0-5 correct answers
         * mediumScore = 6-7 correct answers
         * highScore = 8-10 correct answers
         */
        Resources resultsMessage = getResources();
        String userName = nameField.getText().toString();

        if (score >= 0 && score <= 5) {
            String lowScore = String.format(resultsMessage.getString(R.string.low_score), userName, score);
            Toast.makeText(this, lowScore, Toast.LENGTH_LONG).show();

        } else if (score >= 6 && score <= 7) {
            String mediumScore = String.format(resultsMessage.getString(R.string.medium_score), userName, score);
            Toast.makeText(this, mediumScore, Toast.LENGTH_LONG).show();

        } else {
            String highScore = String.format(resultsMessage.getString(R.string.high_score), userName, score);
            Toast.makeText(this, highScore, Toast.LENGTH_LONG).show();
        }

        /**
         * Reset final score to zero -- avoids user from submitting more than once
         */
        score = 0;

    }
}