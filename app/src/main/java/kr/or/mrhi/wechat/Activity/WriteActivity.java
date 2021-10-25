package kr.or.mrhi.wechat.Activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import kr.or.mrhi.wechat.R;

public class WriteActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView ivBack, ivUpload, ivPhoto;
    private EditText etWrite;
    private TextView tvRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write);

        findViewbyIdFunc();

    }

    private void findViewbyIdFunc() {
        ivBack = findViewById(R.id.ivBack);
        ivUpload = findViewById(R.id.ivUpload);
        ivPhoto = findViewById(R.id.ivPhoto);
        tvRegister = findViewById(R.id.tvRegister);
        etWrite = findViewById(R.id.etWrite);

        ivBack.setOnClickListener(this);
        ivPhoto.setOnClickListener(this);
        ivUpload.setOnClickListener(this);
        tvRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ivBack:
                onBackPressed();
                break;
            case R.id.ivUpload:
                break;
            case R.id.tvRegister:
                break;
            case R.id.ivPhoto:
                break;

        }
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if(etWrite != null){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("작성중인 글이 있습니다. 돌아가시겠습니까?");
            builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    goToMain();
                }
            });
            builder.setNegativeButton("취소", null);
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        }else {
            goToMain();
        }
    }

    private void goToMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
