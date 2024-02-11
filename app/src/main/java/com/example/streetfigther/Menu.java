package com.example.streetfigther;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Menu extends AppCompatActivity {
    MediaPlayer media;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        ArrayList<Peleador>peleadores = new ArrayList<>();
        ImageView imageView = findViewById(R.id.imageView2);

        Glide.with(this)
                .load(R.drawable.fondo)
                .into(imageView);

    }
    public void start(View view){
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }
}