package com.example.movieticketbookingapp;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class movie1 extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movie1);

    }
    Button book = (Button) findViewById(R.id.book);
    Button back = (Button) findViewById(R.id.back);
}
