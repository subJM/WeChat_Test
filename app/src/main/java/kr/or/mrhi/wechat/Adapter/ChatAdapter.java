package kr.or.mrhi.wechat.Adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.Holder> {
    @NonNull
    @Override
    public ChatAdapter.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ChatAdapter.Holder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class Holder extends RecyclerView.ViewHolder {


        public Holder(@NonNull View itemView) {
            super(itemView);


        }
    }
}
