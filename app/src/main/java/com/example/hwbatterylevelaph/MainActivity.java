package com.example.hwbatterylevelaph;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    //animación
    AnimationDrawable brigthness;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //referencia hacia la imageview
        ImageView imageView = (ImageView) findViewById(R.id.image);
        imageView.setBackgroundResource(R.drawable.animation);
        brigthness = (AnimationDrawable) imageView.getBackground();
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        //iniciando la animación
        brigthness.start();
    }
}