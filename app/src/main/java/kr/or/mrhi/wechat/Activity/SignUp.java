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

public class SignUp extends AppCompatActivity {

    private static final String TAG = "SignUpActivity";
    private FirebaseAuth mAuth;
    private EditText etEmail, etPassword, etPasswordOk;


    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.sign_up);
        //Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();

        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        etPasswordOk = findViewById(R.id.etPasswordOk);

        Button btnLogin = findViewById(R.id.btnSignUp);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signUp();
            }
        });

    }

    private void signUp(){

        String email = etEmail.getText().toString();
        String password = etPassword.getText().toString();
        String passworkOk = etPasswordOk.getText().toString();

        if(email.length() > 0 || password.length() > 0 || passworkOk.length() > 0) {
            if (password.equals(passworkOk)) {
                mAuth.createUserWithEmailAndPassword(email, password)
                        .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    // Sign in success, update UI with the signed-in user's information
                                    FirebaseUser user = mAuth.getCurrentUser();
                                    showToast("회원가입 성공");
                                    Intent intent = new Intent(SignUp.this , MainActivity.class);
                                    startActivity(intent);
                                    finish();
                                } else {
                                    if (task.getException() != null) {
                                        // If sign in fails, display a message to the user.
                                        showToast("회원가입 실패");
                                    }
                                }
                            }
                        });
            } else {
                showToast("비밀번호가 일치하지 않습니다.");
            }
        }else {
            showToast("이메일 또는 비밀번호를 입력해주세요");
        }
    }

    private void showToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }

}
