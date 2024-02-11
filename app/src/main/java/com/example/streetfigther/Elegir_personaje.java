package com.example.streetfigther;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class Elegir_personaje extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        ImageView imageView = findViewById(R.id.imageView2);

        Glide.with(this)
                .load(R.drawable.fondo)
                .into(imageView);
    }
}
