package com.example.sistemlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.felipecsl.gifimageview.library.GifImageView;

public class MainActivity extends AppCompatActivity {

    private GifImageView gifImageView;
    private Button btnRegister, btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeView();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Login.class);
                startActivity(intent);
            }
        });
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Registration.class);
                startActivity(intent);
            }
        });


    }

    private void initializeView() {
        btnLogin = findViewById(R.id.login);
        btnRegister = findViewById(R.id.register);
        gifImageView = findViewById(R.id.image);
        gifImageView.startAnimation();

    }
}
