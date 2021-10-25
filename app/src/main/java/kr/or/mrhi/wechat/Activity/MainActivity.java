package kr.or.mrhi.wechat.Activity;

import android.Manifest;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import kr.or.mrhi.wechat.R;

public class MainActivity extends AppCompatActivity implements NavigationBarView.OnItemSelectedListener {

    private FirebaseAuth mAuth;
    private FirebaseUser user;

    private BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = FirebaseAuth.getInstance().getCurrentUser();
        if (user != null) {
            bottomNavigationView = findViewById(R.id.bottomNavigationView);
            bottomNavigationView.setOnItemSelectedListener(this);





        } else {
            // No user is signed in
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        }
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.chat:
                showToast("chat");
                break;
            case R.id.friends:
                showToast("friends");
                break;
        }

        return true;
    }

    private void showToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }
}