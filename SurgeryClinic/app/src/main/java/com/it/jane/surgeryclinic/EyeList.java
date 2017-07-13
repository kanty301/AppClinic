package com.it.jane.surgeryclinic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class EyeList extends AppCompatActivity implements View.OnClickListener{
    LinearLayout li1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye_list);

        li1 = (LinearLayout)findViewById(R.id.li1);
        li1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == li1){
            Intent intent = new Intent(this, Lannawadee_cl.class);
            startActivity(intent);
        }
    }
}
