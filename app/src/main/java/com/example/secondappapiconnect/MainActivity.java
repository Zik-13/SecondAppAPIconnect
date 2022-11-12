package com.example.secondappapiconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static  final  String URL="http://localhost:56722/api/ProductStaffs";

    TextView One, Two, Three, Four, Five, Six;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        One = (TextView) findViewById(R.id.one);
        Two = (TextView) findViewById(R.id.two);
        Three = (TextView) findViewById(R.id.three);
        Four = (TextView) findViewById(R.id.four);
        Five = (TextView) findViewById(R.id.five);
        Six = (TextView) findViewById(R.id.six);

        getData();
    }
    private void getData() {

        // https://youtu.be/c5EHLGsdNeA
    }
}