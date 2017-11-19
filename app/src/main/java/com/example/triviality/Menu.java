package com.example.triviality;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class Menu extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        final View button0 = findViewById(R.id.button0);
        button0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(Menu.this, QuizActivity.class);
                Bundle bd = new Bundle();
                bd.putInt("qid", 0);
                myIntent.putExtras(bd);
                startActivity(myIntent);
                finish();
            }
        });
        final View button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(Menu.this, QuizActivity.class);
                Bundle bd = new Bundle();
                bd.putInt("qid", 5);
                myIntent.putExtras(bd);
                startActivity(myIntent);
                finish();
            }
        });
        final View button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(Menu.this, QuizActivity.class);
                Bundle bd = new Bundle();
                bd.putInt("qid", 10);
                myIntent.putExtras(bd);
                startActivity(myIntent);
                finish();
            }
        });
        final View button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(Menu.this, QuizActivity.class);
                Bundle bd = new Bundle();
                bd.putInt("qid", 15);
                myIntent.putExtras(bd);
                startActivity(myIntent);
                finish();
            }
        });
        final View button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(Menu.this, QuizActivity.class);
                Bundle bd = new Bundle();
                bd.putInt("qid", 20);
                myIntent.putExtras(bd);
                startActivity(myIntent);
                finish();
            }
        });
        final View button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(Menu.this, QuizActivity.class);
                Bundle bd = new Bundle();
                bd.putInt("qid", 25);
                myIntent.putExtras(bd);
                startActivity(myIntent);
                finish();
            }
        });
    }
}
