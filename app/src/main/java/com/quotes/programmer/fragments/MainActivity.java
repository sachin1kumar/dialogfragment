package com.quotes.programmer.fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private FragmentA fragmentA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        fragmentA = new FragmentA();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fragmentA.show(getSupportFragmentManager(),"Dialog Fragment");
            }
        });

    }
}
