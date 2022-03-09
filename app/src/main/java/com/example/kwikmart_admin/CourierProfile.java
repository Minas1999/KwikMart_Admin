package com.example.kwikmart_admin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class CourierProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courier_profile);

        LinearLayout l = findViewById(R.id.editProfile);
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CourierProfile.this, "aaaaaa", Toast.LENGTH_SHORT).show();
            }
        });
    }
}