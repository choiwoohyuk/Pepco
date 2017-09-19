package com.gruzam.ubaki_2;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.view.WindowManager;
import android.widget.ToggleButton;

/**
 * Created by CWH-PC on 2017-07-04.
 */

public class Soum extends Activity {

    SoundPool pool;
    int so_ddok, so_ddak;
    Context context;

    public void onCreate(Bundle savedInstanceState) {



        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soum);
        context = getApplicationContext();

        pool = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);

        so_ddok = pool.load(this, R.raw.qor_emfk, 1);//m2 가 음원이름
        so_ddak = pool.load(this, R.raw.qor_wls, 1);


        final ToggleButton tb =
                (ToggleButton) findViewById(R.id.toggleButton);

        final ToggleButton tb2 =
                (ToggleButton) findViewById(R.id.toggleButton2);

        tb.setOnClickListener  (new View.OnClickListener() {


                                    @Override
                                    public void onClick(View v) {
                                        if(tb.isChecked()){


                                            pool.play(so_ddak, 1, 1, 0, -1, 1);
                                            //tb.getBackground();
                                            tb.setBackgroundDrawable(ContextCompat.getDrawable(context, R.drawable.qor_wlsp));
                                         //   tb.setBackgroundResource(R.drawable.qor_wlsp);
                                           // tb.setBackgroundDrawable(getResources().getDrawable(R.drawable.qor_wlsp));

                                        }
                                        else {
                                            pool.play(so_ddak, 0, 0, 0, -1, 1);


                                            // pool = null;
                                            tb.getBackground();
                                            tb.setBackgroundDrawable(ContextCompat.getDrawable(context, R.drawable.qor_wls));


                                        } // end if
                                    } // end onClick()
                                }
        );

        tb2.setOnClickListener  (new View.OnClickListener() {

                                     @Override
                                     public void onClick(View v) {
                                         if(tb2.isChecked()){




                                             pool.play(so_ddok, 1, 1, 0, -1, 1);

                                             tb2.setBackgroundDrawable(ContextCompat.getDrawable(context, R.drawable.qor_hairp));

                                         }
                                         else {
                                             pool.play(so_ddok, 0, 0, 0, -1, 1);




                                             // pool = null;

                                             tb2.setBackgroundDrawable(ContextCompat.getDrawable(context, R.drawable.qor_hair));


                                         } // end if
                                     } // end onClick()
                                 }
        );





    }// end onCreate()




}

