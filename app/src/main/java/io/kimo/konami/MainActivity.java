package io.kimo.konami;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import io.kimo.konamicode.KonamiCode;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new KonamiCode.Installer(this)
                .on(this)
                .install();
    }
}
