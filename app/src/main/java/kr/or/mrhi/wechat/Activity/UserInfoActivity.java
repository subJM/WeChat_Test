package kr.or.mrhi.wechat.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;

import java.text.SimpleDateFormat;
import java.util.Date;

import kr.or.mrhi.wechat.Data.UserInfoData;
import kr.or.mrhi.wechat.R;

public class UserInfoActivity extends AppCompatActivity {
    private EditText etName, etPhoneNumber, etBirthDay, etAdress;
    private String name, phoneNumber, birthDay, address;
    private Button btnNext;
    private FirebaseAuth auth;
    private FirebaseUser user;
    private FirebaseFirestore firestore;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_member);

        etName = (EditText) findViewById(R.id.etName);
        etPhoneNumber = (EditText) findViewById(R.id.etPhoneNumber);
        etBirthDay = (EditText) findViewById(R.id.etBirthDay);
        etAdress = (EditText) findViewById(R.id.etAdress);

        name = etName.getText().toString();
        phoneNumber = etPhoneNumber.getText().toString();
        birthDay = etBirthDay.getText().toString();
        address = etAdress.getText().toString();

        btnNext = findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateUserInfo(name, phoneNumber, birthDay, address);
                showToast("넥스트");
            }
        });


    }

    //프로필 기본정보 업데이트
    public void updateUserInfo(String name, String phoneNumber, String birthDay, String address) {

        user = auth.getCurrentUser();
        FirebaseFirestore firestore = FirebaseFirestore.getInstance();
        
        long now = System.currentTimeMillis();
        Date mDate = new Date(now);

        SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String getTime = simpleDate.format(mDate);
        showToast(getTime);

        if (name.length() > 1 && phoneNumber.length() > 10 && birthDay.length() > 5 && address.length() > 1) {
            UserInfoData userInfoData = new UserInfoData(getTime, name, phoneNumber, birthDay, address);
            if (user != null) {
                firestore.collection("user").document(user.getEmail()).set(userInfoData)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void aVoid) {
                                showToast("회원정보 등록을 성공하였습니다.");
                                Log.d("updateUserInfo", "DocumentSnapshot successfully written!");
                                Intent intent = new Intent(UserInfoActivity.this,MainActivity.class);
                                startActivity(intent);
                                finish();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                showToast("회원정보 등록을 실패하였습니다.");
                                Log.w("updateUserInfo", "Error writing document", e);
                            }
                        });
            }else {
                showToast("로그인해주세요");
            }
        }else {
            showToast("정보를 입력해주세요");
        }
    }


    public void showToast(String messege) {
        Toast.makeText(getApplicationContext(), messege, Toast.LENGTH_SHORT).show();
    }

}
