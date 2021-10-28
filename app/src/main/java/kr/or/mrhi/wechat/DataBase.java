package kr.or.mrhi.wechat;

import androidx.annotation.NonNull;

import android.content.Context;
import android.content.Intent;
import android.icu.text.SimpleDateFormat;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;


import java.util.Date;

import kr.or.mrhi.wechat.Activity.MainActivity;
import kr.or.mrhi.wechat.Activity.SignUp;
import kr.or.mrhi.wechat.Activity.UserInfoActivity;
import kr.or.mrhi.wechat.Data.BoardData;
import kr.or.mrhi.wechat.Data.UserData;
import kr.or.mrhi.wechat.Data.UserInfoData;

public class DataBase {
    private FirebaseAuth mAuth;
    private FirebaseDatabase database;
    private FirebaseUser user;
    private DatabaseReference mDatabase;


    public void getInstance(){
        database = FirebaseDatabase.getInstance();
        mAuth = FirebaseAuth.getInstance();
    }




    public void insertUserProfile(){
        FirebaseStorage storage = FirebaseStorage.getInstance("gs://wechat-5dd8d.appspot.com/photoUrl");
    }




    //유저 정보(닉네임, 사진) 수정하기
    public void updateUser(String userId, String nickName){
        mDatabase = FirebaseDatabase.getInstance().getReference();
        UserData userData = new UserData(userId,nickName);
        mDatabase.child("users").child(userId).setValue(userData);
    }
    public void updateUser(String userId, String nickName, String photoUrl){
        mDatabase = FirebaseDatabase.getInstance().getReference();

        FirebaseStorage storage = FirebaseStorage.getInstance("gs://wechat-5dd8d.appspot.com/photoUrl");



        UserData userData = new UserData(nickName,photoUrl);
        mDatabase.child("users").child(userId).setValue(userData);
    }

    //유저 게시판
    public void insertBoard(String userId, int writeId, String date, String textWrite, String photoUrl, int favorite){
        mDatabase = FirebaseDatabase.getInstance().getReference();

        ++writeId;
        BoardData writeBoard = new BoardData(userId,writeId,date,textWrite,photoUrl,favorite);
        mDatabase.child("users").child(userId).child("writed").setValue(writeBoard);
    }





    /* 유틸 리티 */


    private void showToast(Context context,String message) {
        Toast.makeText(context.getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }
}