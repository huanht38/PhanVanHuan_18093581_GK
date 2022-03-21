package com.example.phanvanhuan_18093581_gk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Bundle bundle= getIntent().getExtras();
        int id = bundle.getInt("id", 1);
        String name = bundle.getString("name", "test1");
        String detail = bundle.getString("detail", "test1");
        String price = bundle.getString("price", "test1");
        TextView tv_name= (TextView) findViewById(R.id.textView_name);
        TextView tv_detail= (TextView) findViewById(R.id.textView_detail);
        TextView tv_price= (TextView) findViewById(R.id.textView_price_2_3);
        ImageView img=  (ImageView) findViewById(R.id.imageView2);

        tv_name.setText(name);
        tv_detail.setText(detail);
        tv_price.setText(price);
        switch (id){
            case 1:
                img.setImageResource(R.drawable.img_1);
                break;
            case 2:
                img.setImageResource(R.drawable.img_3);
                break;
            default: break;

        }
    }
}