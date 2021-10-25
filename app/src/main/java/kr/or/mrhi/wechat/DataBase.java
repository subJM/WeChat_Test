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
import com.google.firebase.database.Logger;

public class DataBase {
    private FirebaseAuth mAuth;
    private FirebaseDatabase database;
    private DatabaseReference myRef;

    private void getInstance(){
        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("message");

        mAuth = FirebaseAuth.getInstance();
    }

    private void login(){


    }

}