package com.example.tugasonclick;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<user> userlist;
    private RecyclerView recyclerView;
    private MyAdapter.RecyclerVewClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);
        userlist = new ArrayList<>();

        setUserInfo();
        setAdapter();
    }

    private void setAdapter() {
        setOnClickListener();
        MyAdapter adapter = new MyAdapter(userlist, listener);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }

    private void setOnClickListener() {
        listener = new MyAdapter.RecyclerVewClickListener() {
            @Override
            public void onClick(View v, int position) {
                Intent intent = new Intent(getApplicationContext(),profil.class);
                intent.putExtra("name",userlist.get(position).getName());
                intent.putExtra("instagram",userlist.get(position).getInstagram());
                intent.putExtra("foto",userlist.get(position).getImage());
                startActivity(intent);
            }
        };
    }

    private void setUserInfo() {
        userlist.add(new user("Bg Dodo", "@cristiano", R.drawable.bgdodo));
        userlist.add(new user("Ankara Messi", "@leomessi", R.drawable.ankara));
        userlist.add(new user("Bro Rashy", "@marcusrashford", R.drawable.brorashy));
        userlist.add(new user("Han So Hee", "@xeesoxee", R.drawable.hansohe));
        userlist.add(new user("King Mbappiz", "@cumabisawanwan", R.drawable.cloper));
        userlist.add(new user("Go Youn Jung", "@goyounjung", R.drawable.goyoon));
        userlist.add(new user("EVOS E-SPORT NO.1", "@kamipunyaemwang", R.drawable.epos));
        userlist.add(new user("lokal", "@gapunyamworld", R.drawable.lokal));
        userlist.add(new user("Vonzy", "@vonnyfelicia", R.drawable.vonzy));
        userlist.add(new user("Markjukbur", "@orangkaya", R.drawable.jukenbur));
        userlist.add(new user("Muskelon", "@orangkayaa", R.drawable.em));
        userlist.add(new user("Megachann", "@bantengmerah87", R.drawable.megachan));
    }
}