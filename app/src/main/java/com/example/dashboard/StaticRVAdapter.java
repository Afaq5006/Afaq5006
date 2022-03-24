package com.example.dashboard;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StaticRVAdapter extends RecyclerView.Adapter<StaticRVAdapter.staticRvviewHolder>{

    private ArrayList<StaticRVModel> items;
    int row_index = -1;

    public StaticRVAdapter(ArrayList<StaticRVModel> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public staticRvviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.staticrvbackground, parent, false);
        staticRvviewHolder staticRvviewHolder = new staticRvviewHolder(view);
        return staticRvviewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull staticRvviewHolder holder, int position) {
        StaticRVModel currentItems = items.get(position);
        holder.imageView.setImageResource(currentItems.getImage());
        holder.textView.setText(currentItems.getText());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                row_index = position;
                notifyDataSetChanged();

            }
        });
        if (row_index == position){
            holder.linearLayout.setBackgroundResource(R.drawable.recycleback);
        }
        else {
            holder.linearLayout.setBackgroundResource(R.drawable.staticrcselected);
        }

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class staticRvviewHolder extends RecyclerView.ViewHolder{

        TextView textView;
        ImageView imageView;
        LinearLayout linearLayout;
        public staticRvviewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.IV_image);
            textView = itemView.findViewById(R.id.TV_text);
            linearLayout = itemView.findViewById(R.id.linear);
        }
    }
}
