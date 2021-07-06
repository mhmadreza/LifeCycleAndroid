package com.mr.belajarlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ActivityDua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dua);

        /* Menampilkan Tombol Back ( Arrow Back ) pada Action Bar di ActivityDua */
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    /* Membuat method setDisplayHomeAsUpEnabled agar kembali ke halaman sebelumnya menggunakan objek ( Finish ) */
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}