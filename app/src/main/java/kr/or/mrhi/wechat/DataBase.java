package kr.or.mrhi.wechat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;


import kr.or.mrhi.wechat.Data.BoardData;
import kr.or.mrhi.wechat.Data.UserData;

public class DataBase {
    private FirebaseAuth mAuth;
    private FirebaseDatabase database;
    private DatabaseReference mDatabase;


    public void getInstance(){
        database = FirebaseDatabase.getInstance();
        mAuth = FirebaseAuth.getInstance();
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



        UserData userData = new UserData(userId,nickName,photoUrl);
        mDatabase.child("users").child(userId).setValue(userData);
    }

    //유저 게시판
    public void insertBoard(String userId, int writeId, String date, String textWrite, String photoUrl, int favorite){
        mDatabase = FirebaseDatabase.getInstance().getReference();

        ++writeId;
        BoardData writeBoard = new BoardData(userId,writeId,date,textWrite,photoUrl,favorite);
        mDatabase.child("users").child(userId).child("writed").setValue(writeBoard);
    }

    public void insertUserProfile(){
        FirebaseStorage storage = FirebaseStorage.getInstance("gs://wechat-5dd8d.appspot.com/photoUrl");
    }

}