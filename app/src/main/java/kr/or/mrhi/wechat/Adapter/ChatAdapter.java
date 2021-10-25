package kr.or.mrhi.wechat.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import kr.or.mrhi.wechat.Data.UserData;
import kr.or.mrhi.wechat.R;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.Holder> {
    private Context context;
    private ArrayList<UserData> arrayList;

    public ChatAdapter(Context context, ArrayList<UserData> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ChatAdapter.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_fragment_chat,parent,false);
        Holder holder = new Holder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ChatAdapter.Holder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        private ImageView ivProfile;
        private TextView tvId, tvDate, tvWrite;

        public Holder(@NonNull View v) {
            super(v);
            ivProfile = v.findViewById(R.id.ivProfile);
            tvId = v.findViewById(R.id.tvId);
            tvDate = v.findViewById(R.id.tvDate);
            tvWrite = v.findViewById(R.id.tvWrite);
        }
    }
}
