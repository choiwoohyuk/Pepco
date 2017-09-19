package com.gruzam.ubaki_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import static com.gruzam.ubaki_2.R.id.btn_gam0;
import static com.gruzam.ubaki_2.R.id.btn_hak00;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);/*상태바 없애기*/
        setContentView(R.layout.activity_main);
        startActivity(new Intent(this, splashActivity.class));



/*
        ImageView imageView1 = (ImageView)findViewById(R.id.btn_hak00);
        imageView1.setImageResource(R.drawable.mainbtnl);

        ImageView imageView2 = (ImageView)findViewById(R.id.btn_gam0);
        imageView2.setImageResource(R.drawable.mainbtns);

*/

        Button bn_hak0 = (Button)findViewById(btn_hak00);
        bn_hak0.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, com.gruzam.ubaki_2.Learning_01.class);
                        startActivity(intent);



                    }
                }
        );

        Button bn_gam = (Button)findViewById(btn_gam0);
        bn_gam.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent intent = new Intent(MainActivity.this, com.gruzam.ubaki_2.Game_01.class);
                        startActivity(intent);

                    }
                }
        );



    }
}
