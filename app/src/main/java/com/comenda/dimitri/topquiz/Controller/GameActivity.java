package com.comenda.dimitri.topquiz.Controller;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.comenda.dimitri.topquiz.Model.Question;
import com.comenda.dimitri.topquiz.Model.QuestionBank;
import com.comenda.dimitri.topquiz.R;

import java.util.Arrays;

public class GameActivity extends AppCompatActivity {

    private TextView mQuestionText;
    private Button mAnswer1Btn;
    private Button mAnswer2Btn;
    private Button mAnswer3Btn;
    private Button mAnswer4Btn;

    private QuestionBank mQuestionBank;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        mQuestionText = (TextView) findViewById(R.id.activity_game_question1_text);
        mAnswer1Btn = (Button) findViewById(R.id.activity_game_answer1_btn);
        mAnswer2Btn = (Button) findViewById(R.id.activity_game_answer2_btn);
        mAnswer3Btn = (Button) findViewById(R.id.activity_game_answer3_btn);
        mAnswer4Btn = (Button) findViewById(R.id.activity_game_answer4_btn);

        mQuestionBank = this.generateQuestions();


    }

    private QuestionBank generateQuestions() {
        Question question1 = new Question("Quel le nom du président français actuel ?",
                Arrays.asList("François Hollande", "Emmanuel Macron", "Jacques Chirac", "François Mitterand"),
                1);

        Question question2 = new Question("Combien de pays y a t il dans l'UE?",
                Arrays.asList("15", "24", "28", "32"),
                2);

        Question question3 = new Question("Qui le créateur des système d'android?",
                Arrays.asList("Andy Rubin", "Steve Wozniak", "Jake Wharton", "Paul Smith"),
                0);

        Question question4 = new Question("En quelle année le 1er homme a marché sur la lune",
                Arrays.asList("1958", "1962", "1967", "1969"),
                3);

        Question question5 = new Question("Quelle est la capitale de la Roumanie",
                Arrays.asList("Bucarest", "Warsaw", "Budapest", "Berlin"),
                0);

        Question question6 = new Question("Qui est le peintre de mona lisa?",
                Arrays.asList("Michelangelo", "Leonardo Da Vinci", "Raphael", "Carravagio"),
                1);

        Question question7 = new Question("Quelle est l'extension de nom de domaine de la belgique?",
                Arrays.asList(".bg", ".bm", ".bl", ".be"),
                3);


        return new QuestionBank(Arrays.asList(question1,
                question2,
                question3,
                question4,
                question5,
                question6,
                question7));
    }

}
