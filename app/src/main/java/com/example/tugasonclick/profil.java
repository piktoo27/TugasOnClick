package com.example.tugasonclick;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class profil extends AppCompatActivity {
    ImageView image;
    TextView name, instagram;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profil_act);
        image=(ImageView)findViewById(R.id.foto) ;
        name = findViewById(R.id.nametextView);
        instagram = findViewById(R.id.insta);

        image.setImageResource(getIntent().getIntExtra("image",0));
        name.setText(getIntent().getStringExtra("name"));
        instagram.setText(getIntent().getStringExtra("instagram"));


    }
}
