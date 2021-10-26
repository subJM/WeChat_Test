package kr.or.mrhi.wechat.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import kr.or.mrhi.wechat.Adapter.MessageAdapter;
import kr.or.mrhi.wechat.Data.UserData;
import kr.or.mrhi.wechat.R;

public class MessageFragment extends Fragment {
    private MessageAdapter messageAdapter;
    private ArrayList<UserData> arrayList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment_message, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        arrayList.add(new UserData());
        arrayList.add(new UserData());
        arrayList.add(new UserData());
        arrayList.add(new UserData());
        arrayList.add(new UserData());
        arrayList.add(new UserData());
        arrayList.add(new UserData());
        arrayList.add(new UserData());
        arrayList.add(new UserData());
        arrayList.add(new UserData());
        messageAdapter = new MessageAdapter(getContext(), arrayList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(messageAdapter);
        return view;
    }
}
