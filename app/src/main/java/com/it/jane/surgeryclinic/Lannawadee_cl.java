package com.it.jane.surgeryclinic;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Lannawadee_cl extends AppCompatActivity {

    TextView txtHead,txtprice,txtDetail,txtPriceDetail;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lannawadee_cl);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "THSarabun Bold.ttf");
        getSupportActionBar().hide();

        txtHead = (TextView) findViewById(R.id.txtHead);
        txtDetail = (TextView) findViewById(R.id.txtDetail);
        txtprice = (TextView) findViewById(R.id.txtprice);
        txtPriceDetail = (TextView)findViewById(R.id.txtPriceDetail);

        txtHead.setTypeface(typeface);
        txtDetail.setTypeface(typeface);
        txtprice.setTypeface(typeface);
        txtPriceDetail.setTypeface(typeface);
    }


}
