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

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.Holder> {
    private Context context;
    private ArrayList<UserData> arrayList;

    public MessageAdapter(Context context, ArrayList<UserData> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public MessageAdapter.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.message_item,parent,false);
        Holder holder = new Holder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MessageAdapter.Holder holder, int position) {
        holder.ivProfile.setImageResource(R.drawable.user_person_profile_avatar_icon);
        holder.ivSend.setImageResource(R.drawable.send_icon);
        holder.tvId.setText("아이디");
        holder.tvDate.setText("날짜");
        holder.tvWrite.setText("메시지");

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        private ImageView ivProfile, ivSend;
        private TextView tvId, tvDate, tvWrite;

        public Holder(@NonNull View v) {
            super(v);
            ivSend = v.findViewById(R.id.iv_send);
            ivProfile = v.findViewById(R.id.ivProfile);
            tvId = v.findViewById(R.id.tvId);
            tvDate = v.findViewById(R.id.tvDate);
            tvWrite = v.findViewById(R.id.tvWrite);
        }
    }
}
