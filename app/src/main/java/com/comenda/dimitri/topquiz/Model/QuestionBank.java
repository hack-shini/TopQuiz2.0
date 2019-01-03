package com.comenda.dimitri.topquiz.Model;

import java.util.Collections;
import java.util.List;

public class QuestionBank {

    private List<Question> mQuestionList;
    private int mnextQuestionIndex;

    public QuestionBank(List<Question> questionList) {
        mQuestionList = questionList;

        // Shuffle questions
        Collections.shuffle(mQuestionList);

        mnextQuestionIndex = 0;

    }

    public Question getQuestion() {

        if (mnextQuestionIndex == mQuestionList.size()) {
            mnextQuestionIndex = 0;
        }

        return mQuestionList.get(mnextQuestionIndex++);

    }


}
