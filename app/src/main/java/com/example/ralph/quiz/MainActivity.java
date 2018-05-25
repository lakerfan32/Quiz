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
     * Initialize all Radio Buttons, Check Boxes, and Edit Text fields for all correct answers.
     */

    private RadioButton answerRadioButton1b;
    private RadioButton answerRadioButton2d;
    private RadioButton answerRadioButton3a;

    private EditText answerTextField4;

    private RadioButton answerRadioButton5d;

    private CheckBox answer6CheckBox1;
    private CheckBox answer6CheckBox2;
    private CheckBox answer6CheckBox3;
    private CheckBox answer6CheckBox4;
    private CheckBox answer6CheckBox5;
    private CheckBox answer6CheckBox6;

    private RadioButton answerRadioButton7d;

    private EditText answerTextField8;

    private RadioButton answerRadioButton9b;

    private CheckBox answer10CheckBox1;
    private CheckBox answer10CheckBox2;
    private CheckBox answer10CheckBox3;
    private CheckBox answer10CheckBox4;
    private CheckBox answer10CheckBox5;

    /**
     * Declare all ViewById global variables to be used.
     */
    private void assignFindViews() {

        answerRadioButton1b = findViewById(R.id.answer1b);

        answerRadioButton2d = findViewById(R.id.answer2d);

        answerRadioButton3a = findViewById(R.id.answer3a);

        answerTextField4 = findViewById(R.id.answer4_text_field);

        answerRadioButton5d = findViewById(R.id.answer5d);

        answer6CheckBox1 = findViewById(R.id.answer6_option1);
        answer6CheckBox2 = findViewById(R.id.answer6_option2);
        answer6CheckBox3 = findViewById(R.id.answer6_option3);
        answer6CheckBox4 = findViewById(R.id.answer6_option4);
        answer6CheckBox5 = findViewById(R.id.answer6_option5);
        answer6CheckBox6 = findViewById(R.id.answer6_option6);

        answerRadioButton7d = findViewById(R.id.answer7d);

        answerTextField8 = findViewById(R.id.answer8_text_field);

        answerRadioButton9b = findViewById(R.id.answer9b);

        answer10CheckBox1 = findViewById(R.id.answer10_option1);
        answer10CheckBox2 = findViewById(R.id.answer10_option2);
        answer10CheckBox3 = findViewById(R.id.answer10_option3);
        answer10CheckBox4 = findViewById(R.id.answer10_option4);
        answer10CheckBox5 = findViewById(R.id.answer10_option5);

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
        if (answerRadioButton1b.isChecked()) {
            score = score + 1;
        }

        /**
         * This method checks answer for Question 2.
         */
        if (answerRadioButton2d.isChecked()) {
            score = score + 1;
        }

        /**
         * This method checks answer for Question 3.
         */
        if (answerRadioButton3a.isChecked()) {
            score = score + 1;
        }

        /**
         * This method checks answer for Question 4.
         */
        EditText questionFour = (EditText) findViewById(R.id.answer4_text_field);
        String answer4 = answerTextField4.getText().toString();
        if (answer4.equalsIgnoreCase("Hobbit")) {

            score = score + 1;
        }

        /**
         * This method checks answer for Question 5.
         */
        if (answerRadioButton5d.isChecked()) {
            score = score + 1;
        }

        /**
         * This method checks answer for Question 6.
         * CheckBoxes 1,3,4 and 6 are the correct answers.
         */
        if (answer6CheckBox1.isChecked() && answer6CheckBox3.isChecked() &&
                answer6CheckBox4.isChecked() && answer6CheckBox6.isChecked() &&
                !answer6CheckBox2.isChecked() && !answer6CheckBox5.isChecked()) {
            score = score + 1;
        }

        /**
         * This method checks answer for Question 7.
         */
        if (answerRadioButton7d.isChecked()) {
            score = score + 1;
        }

        /**
         * This method checks answer for Question 8.
         */
        EditText questionEight = (EditText) findViewById(R.id.answer8_text_field);
        String answer8 = answerTextField8.getText().toString();
        if (answer8.equalsIgnoreCase("South America")) {

            score = score + 1;
        }

        /**
         * This method checks answer for Question 9.
         */
        if (answerRadioButton9b.isChecked()) {
            score = score + 1;
        }

        /**
         * This method checks answer for Question 10.
         * CheckBoxes 2 and 4 are the correct answers.
         */
        if (answer10CheckBox2.isChecked() && answer10CheckBox4.isChecked() &&
                !answer10CheckBox1.isChecked() && !answer10CheckBox3.isChecked() &&
                !answer10CheckBox5.isChecked() ) {
            score = score + 1;
        }

    /**
    * Display the user's final score.
    */
    Resources resultsMessage = getResources();
    String text = String.format(resultsMessage.getString(R.string.results), score);
    Toast.makeText(this, text, Toast.LENGTH_LONG).show();

    }

}