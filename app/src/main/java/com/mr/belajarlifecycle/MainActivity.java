package com.mr.belajarlifecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnPindahHalaman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showToast("Method onCreate");
        //Toast.makeText(MainActivity.this, "Method onCreate", Toast.LENGTH_SHORT).show();

        btnPindahHalaman = (Button)findViewById(R.id.btn_pindahHalaman);
        btnPindahHalaman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* Cara menggunakan Intent( Pindah Halaman ) CARA 1 */
//                Intent intent = new Intent(MainActivity.this, ActivityDua.class);
//                startActivity(intent);

                /* Cara menggunakan Intent( Pindah Halaman ) CARA 2 */
                startActivity(new Intent(MainActivity.this, ActivityDua.class));
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        showToast("Method onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        showToast("Method onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        showToast("Method onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        showToast("Method onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        showToast("Method onDestroy");
    }

    private void showToast(String pesan){
        Toast.makeText(MainActivity.this, pesan, Toast.LENGTH_SHORT).show();
    }
}