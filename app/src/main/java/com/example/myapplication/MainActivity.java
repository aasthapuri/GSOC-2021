package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {

    private Button Individual,Facility;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        TextView textView = findViewById(R.id.textView);
//        String text="By continuing you agree to our Privacy Policies \\n Data Use Policies , including our Cookie Use";
//
//        SpannableString string = new SpannableString(text);
//        ForegroundColorSpan fcsblue = new ForegroundColorSpan(Color.RED);
//        string.setSpan(fcsblue, 22, 111, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
//        textView.setText(string);

        Individual = (Button) findViewById(R.id.Indvidual);
        Facility = (Button) findViewById(R.id.Facility);

        Individual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });

        Facility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });


    }
}