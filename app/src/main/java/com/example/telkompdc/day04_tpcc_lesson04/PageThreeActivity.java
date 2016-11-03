package com.example.telkompdc.day04_tpcc_lesson04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PageThreeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_three);

        Button pagethreeBack = (Button) findViewById(R.id.pagethree_back);

        pagethreeBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(PageThreeActivity.this, PageTwoActivity.class);
                startActivity(intent);
            }


        });



    }
}
