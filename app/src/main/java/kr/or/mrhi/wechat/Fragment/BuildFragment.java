package kr.or.mrhi.wechat.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import kr.or.mrhi.wechat.Activity.LoginActivity;
import kr.or.mrhi.wechat.R;

public class BuildFragment extends Fragment implements View.OnClickListener {
    private FirebaseAuth auth;
    private FirebaseUser user;
    private Button btnLogout;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment_management, container, false);
        user = FirebaseAuth.getInstance().getCurrentUser();
        if(user == null){

        }

        btnLogout = view.findViewById(R.id.btnLogout);
        btnLogout.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnLogout:
                goToLogin(view);
                break;
        }
    }

    private void goToLogin(View view) {
        FirebaseAuth.getInstance().signOut();
        Intent intent = new Intent(view.getContext(), LoginActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        getActivity().finish();

    }

    @Override
    public void onDetach() {
        super.onDetach();
    }


}
