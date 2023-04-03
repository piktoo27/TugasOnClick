package com.example.tugasonclick;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private ArrayList<user> userlist;
    private RecyclerVewClickListener listener;

    public MyAdapter (ArrayList<user> userlist, RecyclerVewClickListener listener){
        this.userlist = userlist;
        this.listener = listener;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView nameTxt;
        private TextView instagramTxt;
        private ImageView imageeView;

        public MyViewHolder(final View view){
            super(view);
            nameTxt = view.findViewById(R.id.nama);
            instagramTxt = view.findViewById(R.id.ig);
            imageeView = view.findViewById(R.id.imageview);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            listener.onClick(view, getAdapterPosition());

        }
    }



    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {
        String name = userlist.get(position).getName();
        holder.nameTxt.setText(name);

        String instagram = userlist.get(position).getInstagram();
        holder.instagramTxt.setText(instagram);

        int image = userlist.get(position).getImage();
        holder.imageeView.setImageResource(image);

    }

    @Override
    public int getItemCount() {
        return userlist.size();
    }
    public interface RecyclerVewClickListener{
        void onClick(View v, int position);
    }
}
