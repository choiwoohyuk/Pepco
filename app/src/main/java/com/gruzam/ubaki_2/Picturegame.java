package com.gruzam.ubaki_2;

import android.app.Activity;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import static com.gruzam.ubaki_2.R.id.imageView;

/**
 * Created by CWH-PC on 2017-07-04.
 */

public class Picturegame extends Activity implements View.OnClickListener {
    ImageView zkem_btn;
    ImageView zkem_bt;

    int i=1;
    SoundPool pool;
    int ddok;
    Animation zkem_ani;

    public void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);/*상태바 없애기*/
        super.onCreate(savedInstanceState);
        setContentView(R.layout.picturegame);

        zkem_btn=(ImageView)findViewById(R.id.image);
        zkem_bt=(ImageView)findViewById(imageView);
        zkem_ani = AnimationUtils.loadAnimation(this, R.anim.zkem_ani);
        zkem_btn.setOnClickListener(this);
//아래 3개가 사운드 설정
        pool = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);

        findViewById(R.id.imageButton2).setOnClickListener(mClickListener);



    }
    //소리부분
    Button.OnClickListener mClickListener = new Button.OnClickListener()
    {
        public void onClick(View v)
        {


            //음악은 zkem_s_짝수만
            if (i>0)
            {

                pool.play(ddok, 1, 1, 0, 0, 1);


            }}};

    public void onClick(View view) {
        if(i<30) {

            zkem_bt.startAnimation(zkem_ani);//애니메이션

            zkem_bt.setImageResource(getResources().getIdentifier("zkem_g" + i, "drawable",
                    this.getPackageName()));

//이름표 짝수로만넣기

//t짝수일때만 그림이나옴
            switch (i % 2) {
                case 1:


                    i++;

                    ddok = pool.load(this, getResources().getIdentifier("zkem_s_"+i,"raw",this.getPackageName()) ,1);//m2 가 음원이름

                    zkem_btn.setImageResource(getResources().getIdentifier("zkem_t" + i, "drawable",
                            this.getPackageName()));


                    break;


                case 0:

                    ddok = pool.load(this, getResources().getIdentifier("zkem_s_"+i,"raw",this.getPackageName()) ,1);//m2 가 음원이름

                    zkem_btn.setImageResource(getResources().getIdentifier("zkem_t" + i, "drawable",
                            this.getPackageName()));


                    i++;


                    break;
            }

        }
        else{ zkem_btn.setImageResource(getResources().getIdentifier("zkem_t" + 30, "drawable",
                this.getPackageName()));
//g에는 짝수값만줘서 홀수일대는 하얀색이나옴





            zkem_bt.setImageResource(getResources().getIdentifier("zkem_g" + i, "drawable",
                    this.getPackageName()));

            ddok = pool.load(this, getResources().getIdentifier("zkem_s_"+i,"raw",this.getPackageName()) ,1);//m2 가 음원이름
//zkem_s_9 소리가나옴
//마지막사진 ex)수고하셧습니다
            i=1;}


    }
}