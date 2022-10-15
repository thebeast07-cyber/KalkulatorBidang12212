package com.example.kalkulatorbidang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void persegi(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new persegi()).commit();
    }

    public void segitiga(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new segitiga()).commit();
    }

    public void lingkaran(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new lingkaran()).commit();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}