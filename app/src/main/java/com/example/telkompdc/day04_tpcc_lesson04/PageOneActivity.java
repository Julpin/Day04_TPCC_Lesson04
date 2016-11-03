package com.example.telkompdc.day04_tpcc_lesson04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PageOneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_one);
        Button pageoneNext = (Button) findViewById(R.id.pageone_next);




        pageoneNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PageOneActivity.this, PageTwoActivity.class);
                startActivity(intent);
            }
        }


        );
    }
}

