package com.gruzam.ubaki_2;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;


import static com.gruzam.ubaki_2.R.id.btn_abutton;
import static com.gruzam.ubaki_2.R.id.btn_bbutton;
import static com.gruzam.ubaki_2.R.id.btn_cbutton;
import static com.gruzam.ubaki_2.R.id.btn_dbutton;
import static com.gruzam.ubaki_2.R.id.btn_ebutton;
import static com.gruzam.ubaki_2.R.id.btn_fbutton;
import static com.gruzam.ubaki_2.R.id.btn_gbutton;
import static com.gruzam.ubaki_2.R.id.btn_mcbutton;

/**
 * Created by CWH-PC on 2017-07-04.
 */

public class Music_Item extends Activity{

    SoundPool pool;
    int m1, m2, m3, m4, m5, m6, m7, m8;
    //private float downX, downY, upX, upY;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);/*상태바 없애기*/
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_USER_LANDSCAPE);/*가로로 눞히기*/
        setContentView(R.layout.music_item);


        pool = new SoundPool(8, AudioManager.STREAM_MUSIC, 0);
        m1 = pool.load(this, R.raw.mediax1, 1);
        m2 = pool.load(this, R.raw.mediax2, 1);
        m3 = pool.load(this, R.raw.mediax3, 1);
        m4 = pool.load(this, R.raw.mediax4, 1);
        m5 = pool.load(this, R.raw.mediax5, 1);
        m6 = pool.load(this, R.raw.mediax6, 1);
        m7 = pool.load(this, R.raw.mediax7, 1);
        m8 = pool.load(this, R.raw.mediax8, 1);
/*
        Button bn_cbtn = (Button) findViewById(btn_cbutton);
        Button bn_dbtn = (Button) findViewById(btn_dbutton);
        Button bn_ebtn = (Button) findViewById(btn_ebutton);
        Button bn_fbtn = (Button) findViewById(btn_fbutton);
        Button bn_gbtn = (Button) findViewById(btn_gbutton);
        Button bn_abtn = (Button) findViewById(btn_abutton);
        Button bn_bbtn = (Button) findViewById(btn_bbutton);
        Button bn_mcbtn = (Button) findViewById(btn_mcbutton);

        bn_cbtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        pool.play(m1, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_CANCEL:
                        pool.play(m1, 1, 1, 0, 0, 1);
                        break;


                    default:
                        break;

                }

                return true;
            }
        });

        bn_dbtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        pool.play(m2, 1, 1, 0, 0, 1);
                        break;
                    case MotionEvent.ACTION_CANCEL:
                        pool.play(m1, 1, 1, 0, 0, 1);

                        break;
                    default:
                        break;

                }

                return true;
            }
        });

        bn_ebtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        pool.play(m3, 1, 1, 0, 0, 1);
                        break;
                    default:
                        break;

                }

                return true;
            }
        });

        bn_fbtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        pool.play(m4, 1, 1, 0, 0, 1);
                        break;
                    default:
                        break;

                }

                return true;
            }
        });

        bn_gbtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        pool.play(m5, 1, 1, 0, 0, 1);
                        break;

                    default:
                        break;

                }

                return true;
            }
        });

        bn_abtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        pool.play(m6, 1, 1, 0, 0, 1);
                        break;

                    default:
                        break;

                }

                return true;
            }
        });

        bn_bbtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        pool.play(m7, 1, 1, 0, 0, 1);
                        break;
                    default:
                        break;

                }

                return true;
            }
        });

        bn_mcbtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        pool.play(m8, 1, 1, 0, 0, 1);
                        break;
                    default:
                        break;

                }

                return true;
            }
        });

*/

        Button bn_cbtn = (Button) findViewById(btn_cbutton);
        bn_cbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pool.play(m1, 1, 1, 0, 0, 1);
            }
        });
        Button bn_dbtn = (Button) findViewById(btn_dbutton);
        bn_dbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pool.play(m2, 1, 1, 0, 0, 1);
            }
        });

        Button bn_ebtn = (Button) findViewById(btn_ebutton);
        bn_ebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pool.play(m3, 1, 1, 0, 0, 1);
            }
        });

        Button bn_fbtn = (Button) findViewById(btn_fbutton);
        bn_fbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pool.play(m4, 1, 1, 0, 0, 1);
            }
        });

        Button bn_gbtn = (Button) findViewById(btn_gbutton);
        bn_gbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pool.play(m5, 1, 1, 0, 0, 1);
            }
        });

        Button bn_abtn = (Button) findViewById(btn_abutton);
        bn_abtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pool.play(m6, 1, 1, 0, 0, 1);
            }
        });

        Button bn_bbtn = (Button) findViewById(btn_bbutton);
        bn_bbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pool.play(m7, 1, 1, 0, 0, 1);
            }
        });

        Button bn_mcbtn = (Button) findViewById(btn_mcbutton);
        bn_mcbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pool.play(m8, 1, 1, 0, 0, 1);
            }
        });

    }



}





