package com.gruzam.ubaki_2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.gruzam.ubaki_2.Ddal;
import com.gruzam.ubaki_2.R;

import static com.gruzam.ubaki_2.R.id.btn_jaja;
import static com.gruzam.ubaki_2.R.id.btn_boom;
import static com.gruzam.ubaki_2.R.id.btn_dd;
import static com.gruzam.ubaki_2.R.id.btn_soso;
import static com.gruzam.ubaki_2.R.id.btn_musicitem;
import static com.gruzam.ubaki_2.R.id.btn_picture;
/**
 * Created by CWH-PC on 2017-07-04.
 */

public class Game_01 extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.game_01);

        Button bn_ja = (Button)findViewById(btn_jaja);
        bn_ja.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent intent = new Intent(Game_01.this, com.gruzam.ubaki_2.Jajang.class);
                        startActivity(intent);
                    }
                }
        );

        Button bn_bom = (Button)findViewById(btn_boom);
        bn_bom.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent intent = new Intent(Game_01.this, com.gruzam.ubaki_2.Pungsun.class);
                        startActivity(intent);
                    }
                }
        );

        Button bn_dadari = (Button)findViewById(btn_dd);
        bn_dadari.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent intent = new Intent(Game_01.this,Ddal.class);
                        startActivity(intent);
                    }
                }
        );

        Button bn_mi = (Button)findViewById(btn_musicitem);
        bn_mi.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent intent = new Intent(Game_01.this, com.gruzam.ubaki_2.Music_Item.class);
                        startActivity(intent);
                    }
                }
        );

        Button bn_pic = (Button)findViewById(btn_picture);
        bn_pic.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent intent = new Intent(Game_01.this, com.gruzam.ubaki_2.Picturegame.class);
                        startActivity(intent);
                    }
                }
        );

        Button bn_so = (Button)findViewById(btn_soso);
        bn_so.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent intent = new Intent(Game_01.this, com.gruzam.ubaki_2.Soum.class);
                        startActivity(intent);
                    }
                }
        );

    }
}