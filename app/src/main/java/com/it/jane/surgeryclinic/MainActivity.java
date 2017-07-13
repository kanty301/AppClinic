package com.it.jane.surgeryclinic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnlist;
    ImageView img1,img2,img3,img4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnlist = (Button) findViewById(R.id.btnlist);
        btnlist.setOnClickListener(this);

        img1 = (ImageView)findViewById(R.id.img1);
        img2 = (ImageView)findViewById(R.id.img2);
        img3 = (ImageView)findViewById(R.id.img3);
        img4 = (ImageView)findViewById(R.id.img4);

        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);
        img4.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(v == btnlist){
            Intent intent = new Intent(this, Menu.class);
            startActivity(intent);
        }

        if(v == img1){
            Intent intent = new Intent(this, Lannawadee_cl.class);
            startActivity(intent);
        }
    }
}
