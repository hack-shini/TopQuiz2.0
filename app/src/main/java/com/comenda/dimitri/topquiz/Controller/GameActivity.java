package com.comenda.dimitri.topquiz.Controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.comenda.dimitri.topquiz.R;

public class GameActivity extends AppCompatActivity {

    private TextView mQuestionText;
    private Button mAnswer1Btn;
    private Button mAnswer2Btn;
    private Button mAnswer3Btn;
    private Button mAnswer4Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        mQuestionText = (TextView) findViewById(R.id.activity_game_question1_text);
        mAnswer1Btn = (Button) findViewById(R.id.activity_game_answer1_btn);
        mAnswer2Btn = (Button) findViewById(R.id.activity_game_answer2_btn);
        mAnswer3Btn = (Button) findViewById(R.id.activity_game_answer3_btn);
        mAnswer4Btn = (Button) findViewById(R.id.activity_game_answer4_btn);

    }
}
