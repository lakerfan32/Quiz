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

        question1Answer1b = findViewById(R.id.answer1b);

        question2Answer2d = findViewById(R.id.answer2d);

        question3Answer3a = findViewById(R.id.answer3a);

        question4Answer = findViewById(R.id.answer4_text_field);

        question5Answer5d = findViewById(R.id.answer5d);

        question6AnswerBox1 = findViewById(R.id.answer6_option1);
        question6AnswerBox2 = findViewById(R.id.answer6_option2);
        question6AnswerBox3 = findViewById(R.id.answer6_option3);
        question6AnswerBox4 = findViewById(R.id.answer6_option4);
        question6AnswerBox5 = findViewById(R.id.answer6_option5);
        question6AnswerBox6 = findViewById(R.id.answer6_option6);

        question7Answer7d = findViewById(R.id.answer7d);

        question8Answer = findViewById(R.id.answer8_text_field);

        question9Answer9b = findViewById(R.id.answer9b);

        question10AnswerBox1 = findViewById(R.id.answer10_option1);
        question10AnswerBox2 = findViewById(R.id.answer10_option2);
        question10AnswerBox3 = findViewById(R.id.answer10_option3);
        question10AnswerBox4 = findViewById(R.id.answer10_option4);
        question10AnswerBox5 = findViewById(R.id.answer10_option5);

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
        EditText questionFour = (EditText) findViewById(R.id.answer4_text_field);
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
        EditText questionEight = (EditText) findViewById(R.id.answer8_text_field);
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
    */
    Resources resultsMessage = getResources();
    String userName = nameField.getText().toString();
    String finalResults = String.format(resultsMessage.getString(R.string.results), userName, score);
    Toast.makeText(this, finalResults, Toast.LENGTH_LONG).show();

    /**
    * Reset final score to zero -- avoids user from submitting more than once
    */
    score = 0;

    }
}