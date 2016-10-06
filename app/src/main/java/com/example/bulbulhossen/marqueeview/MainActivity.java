package com.example.bulbulhossen.marqueeview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.sunfusheng.marqueeview.MarqueeView;

public class MainActivity extends AppCompatActivity {
    private MarqueeView marqueeView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        marqueeView4 = (MarqueeView) findViewById(R.id.marqueeView4);
        marqueeView4.startWithText(getString(R.string.marquee_text));

    }
}
