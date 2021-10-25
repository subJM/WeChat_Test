package kr.or.mrhi.wechat.Activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
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
                finish();
                break;
            case R.id.ivUpload:
                break;
            case R.id.tvRegister:
                break;
            case R.id.ivPhoto:
                break;

        }
    }
}
