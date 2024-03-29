package br.com.zup.OnboardingZup.ui.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import br.com.zup.onboarding.android.R;


public class ResultActivity extends AppCompatActivity {
    private Button btnAnswerQuestions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        setLayout();
        setBtnAnswerQuizClickListener();
    }

    private void setLayout() {
        btnAnswerQuestions = findViewById(R.id.answer_quiz);
    }

    private void setBtnAnswerQuizClickListener() {
        btnAnswerQuestions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResultActivity.this, QuestionActivity.class);
                startActivity(intent);
            }
        });
    }
}
