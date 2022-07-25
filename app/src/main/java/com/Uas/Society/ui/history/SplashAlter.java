package com.Uas.Society.ui.history;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

import com.Uas.Society.R;
import com.Uas.Society.ui.main.MainActivity;

public class SplashAlter extends AppCompatActivity {
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_alter);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //getSupportActionBar().hide();

        progressBar = findViewById(R.id.pb);
        new Thread(new Runnable() {
            public void run() {
                jalankanProgress();
                masukAktivitasUtama();
                finish();
            }
        }).start();
    }

    private void jalankanProgress() {
        for (int progress=0; progress<100; progress+=10) {
            try {
                Thread.sleep(200);
                progressBar.setProgress(progress);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void masukAktivitasUtama() {
        Intent intent = new Intent(SplashAlter.this,
                MainActivity.class);
        startActivity(intent);
    }
}

