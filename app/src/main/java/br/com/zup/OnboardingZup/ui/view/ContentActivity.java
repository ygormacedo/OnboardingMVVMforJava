package br.com.zup.OnboardingZup.ui.view;

import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.UserData;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

import br.com.zup.OnboardingZup.R;

public class ContentActivity extends AppCompatActivity implements LiveData<UserData> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(this);
        if (acct != null) {

            TextView nameZuuper = findViewById(R.id.name_zuper_cnt);
            String personName = acct.getDisplayName();
            nameZuuper.setText(personName);
            savedText();
            nextQuestions();
        }
    }
        private void nextQuestions() {
            Button seeLater = findViewById(R.id.btn_content);
            seeLater.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(ContentActivity.this, HomeActivity.class);
                    startActivity(intent);
                }
            });
        }

        private void savedText(LiveData  liveData) {

            EditText projectContent = findViewById(R.id.project_edit_text);
            EditText podContent = findViewById(R.id.pod_edit_text);

        }
}
