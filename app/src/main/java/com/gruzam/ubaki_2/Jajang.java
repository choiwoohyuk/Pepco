package com.gruzam.ubaki_2;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by CWH-PC on 2017-07-04.
 */

public class Jajang extends Activity {

    MediaPlayer mp;
    ImageView ppap;
    Button btn;

    int playstopBtns[] = {R.id.pineapple, R.id.orange, R.id.selNo , R.id.pau};

    int resMp3[] = {R.raw.face, R.raw.red};

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jajang);



        for (int btns : playstopBtns) {
            btn = (Button) findViewById(btns);
            btn.setOnClickListener(clickListener);
        }

    }
//
    View.OnClickListener clickListener = new View.OnClickListener() {

        public void onClick(View v) {

            switch (v.getId()) {

                case R.id.pineapple:
                    Play(0);
                    break;
                case R.id.orange:
                    Play(1);
                    break;

                case R.id.pau:
                    another();
                    break;


                default:
                    Stop();
            }

        }

    };

    private  void another(){
        btn.getBackground();


        if(mp==null){


        }else{
            if(mp.isPlaying()){
// 재생중이면 실행될 작업 (정지)
                mp.pause();

                btn.setBackground(ContextCompat.getDrawable(this, R.drawable.pause));


            }else{
// 재생중이 아니면 실행될 작업 (재생)
                mp.start();

                btn.setBackground(ContextCompat.getDrawable(this, R.drawable.play));

            }}

    }

    private void Play(int selNo) {

        Stop();

        mp = MediaPlayer.create(Jajang.this, resMp3[selNo]);
        mp.start();
    }

    private void Stop() {

        if (mp != null) {
            mp.stop();
            mp = null;
        }

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Stop();
    }

    }
