package com.example.my_simon;

import android.graphics.Typeface;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Typeface tf = Typeface.createFromAsset(getAssets(),  "fonts/digitaldismay.otf");
        TextView gv = (TextView) findViewById(R.id.gameAbout_TextView);
        gv.setTypeface(tf);
    }
}