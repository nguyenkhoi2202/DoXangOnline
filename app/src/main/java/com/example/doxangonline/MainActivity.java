package com.example.doxangonline;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button btn20;
    Button btn30;
    Button btn50;
    Button btn70;
    Button btn100;
    Button btnFull;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn20 = findViewById(R.id.btn20k);
        btn30 = findViewById(R.id.btn30k);
        btn50 = findViewById(R.id.btn50k);
        btn70 = findViewById(R.id.btn70k);
        btn100 = findViewById(R.id.btn100k);
        btnFull = findViewById(R.id.btnFull);

        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DoXangActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("money", 20);
                intent.putExtra("data", bundle);
                startActivity(intent);
            }
        });
        btn30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DoXangActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("money", 30);
                intent.putExtra("data", bundle);
                startActivity(intent);
            }
        });
        btn50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DoXangActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("money", 50);
                intent.putExtra("data", bundle);
                startActivity(intent);
            }
        });
        btn70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DoXangActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("money", 70);
                intent.putExtra("data", bundle);
                startActivity(intent);
            }
        });
        btn100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DoXangActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("money", 100);
                intent.putExtra("data", bundle);
                startActivity(intent);
            }
        });
        btnFull .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DoXangActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("money", 150);
                intent.putExtra("data", bundle);
                startActivity(intent);
            }
        });
    }
}