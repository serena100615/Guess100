package com.example.user.guess100;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int n = new Random().nextInt(100)+1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);TextView secret = (TextView) findViewById(R.id.secret);
        TextView info = (TextView) findViewById(R.id.info);
        EditText number = (EditText) findViewById(R.id.number);
        Button send = (Button) findViewById(R.id.send);
    }
public void send (View view){

}

}
