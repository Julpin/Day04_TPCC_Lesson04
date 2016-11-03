package com.example.telkompdc.day04_tpcc_lesson04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PageTwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_two);

        Button pagetwoBack = (Button) findViewById(R.id.pagetwo_back);
        Button pagetwoNext = (Button) findViewById(R.id.pagetwo_next);

        pagetwoBack.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View view){
                Intent intent = new Intent(PageTwoActivity.this, PageOneActivity.class);
                startActivity(intent);
            }


        });

        pagetwoNext.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(PageTwoActivity.this, PageThreeActivity.class);
                startActivity(intent);
            }


        });


    }
}
