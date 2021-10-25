package kr.or.mrhi.wechat.Activity;

import static android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP;

import android.Manifest;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationBarView;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import kr.or.mrhi.wechat.Fragment.BuildFragment;
import kr.or.mrhi.wechat.R;

public class MainActivity extends AppCompatActivity implements NavigationBarView.OnItemSelectedListener {

    private FirebaseAuth mAuth;
    private FirebaseUser user;

    private BottomNavigationView bottomNavigationView;
    private FloatingActionButton goToWrite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = FirebaseAuth.getInstance().getCurrentUser();
        if (user != null) {
            bottomNavigationView = findViewById(R.id.bottomNavigationView);
            bottomNavigationView.setOnItemSelectedListener(this);

            findViewById(R.id.goToWrite).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, WriteActivity.class);
                    startActivity(intent);
                    showToast("Write");
                }
            });


        } else {
            // No user is signed in
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            intent.addFlags(FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);

        }
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.chat:
                showToast("Chat");
                break;
            case R.id.friends:
                showToast("Friends");
                break;
            case R.id.message:
                showToast("Message");
                break;
            case R.id.build:
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                BuildFragment buildFragment = new BuildFragment();
                ft.replace(R.id.frameLayout, buildFragment);
                ft.commit();
                showToast("Build");
                break;
        }

        return true;
    }

    private void showToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }
}