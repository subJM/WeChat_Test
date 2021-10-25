package kr.or.mrhi.wechat.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import kr.or.mrhi.wechat.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "SignUpActivity";
    private FirebaseAuth mAuth;
    private EditText etEmailLogin, etPasswordLogin;
    private Button btnLogin, goToSignUp;

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.login);
        //Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();

        etEmailLogin = findViewById(R.id.etEmailLogin);
        etPasswordLogin = findViewById(R.id.etPasswordLogin);

        btnLogin = findViewById(R.id.btnLogin);
        goToSignUp = findViewById(R.id.goToSignUp);

        btnLogin.setOnClickListener(this);
        goToSignUp.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnLogin:
                startLogin();
                break;
            case R.id.goToSignUp:
                Intent intent = new Intent(LoginActivity.this, SignUp.class);
                startActivity(intent);
                finish();
                break;
        }

    }

    private void startLogin() {

        String email = etEmailLogin.getText().toString();
        String password = etPasswordLogin.getText().toString();

        if (email.length() > 0 && password.length() > 0) {
            mAuth.signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                // Sign in success, update UI with the signed-in user's information
                                FirebaseUser user = mAuth.getCurrentUser();
                                showToast("로그인 성공");
                                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                                startActivity(intent);
                                finish();
                            } else {
                                if (task.getException() != null) {
                                    // If sign in fails, display a message to the user.
                                    showToast("로그인 실패");
                                }
                            }
                        }
                    });

        } else {
            showToast("이메일 또는 비밀번호를 입력해주세요");
        }
    }

    private void showToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
