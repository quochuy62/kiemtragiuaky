package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CaptailAdapter extends RecyclerView.Adapter<CaptailAdapter.CaptailViewHolder> {
    private List<Capital> capitalList;

    public CaptailAdapter(List<Capital> capitalList) {
        this.capitalList = capitalList;
    }

    @NonNull
    @Override
    public CaptailViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        return new CaptailViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CaptailViewHolder holder, int position) {
        Capital capital = capitalList.get(position);
        if (capital == null) return;
        holder.txtInfo.setText(capital.getName());
    }


    @Override
    public int getItemCount() {
        if (capitalList != null) return capitalList.size();
        return 0;
    }

    public class CaptailViewHolder extends RecyclerView.ViewHolder {
        private TextView txtInfo;

        public CaptailViewHolder(@NonNull View itemView) {
            super(itemView);
            txtInfo = itemView.findViewById(R.id.tv_info);
        }
    }
}
