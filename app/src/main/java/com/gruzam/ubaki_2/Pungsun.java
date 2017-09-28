package com.gruzam.ubaki_2;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by CWH-PC on 2017-07-04.
 */

import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by CWH-PC on 2017-07-04.
 */

public class Pungsun extends Activity {
    int index = (int)(Math.random()*5);
    int res = ran[index];
    int test;

    int a_1 = (int)(Math.random()*5);
    int a_2 = (int)(Math.random()*5);
    int a_3 = (int)(Math.random()*5);
    int a_4 = (int)(Math.random()*5);
    int a_5 = (int)(Math.random()*5);

    int a_6 = (int)(Math.random()*5);
    int a_7 = (int)(Math.random()*5);
    int a_8 = (int)(Math.random()*5);
    int a_9 = (int)(Math.random()*5);
    int a_10 = (int)(Math.random()*5);

    int a_11 = (int)(Math.random()*5);
    int a_12 = (int)(Math.random()*5);
    int a_13 = (int)(Math.random()*5);
    int a_14 = (int)(Math.random()*5);
    int a_15 = (int)(Math.random()*5);

    int a_16 = (int)(Math.random()*5);
    int a_17 = (int)(Math.random()*5);
    int a_18 = (int)(Math.random()*5);
    int a_19 = (int)(Math.random()*5);
    int a_20 = (int)(Math.random()*5);

    int a_21 = (int)(Math.random()*5);
    int a_22 = (int)(Math.random()*5);
    int a_23 = (int)(Math.random()*5);
    int a_24 = (int)(Math.random()*5);
    int a_25 = (int)(Math.random()*5);

    public static final int ran[]={R.drawable.ps_green,R.drawable.ps_orange,
            R.drawable.ps_purple,R.drawable.ps_red,R.drawable.ps_yellow};

//addtsesat
    //ImageView img[] = new ImageView[24];
    /*int[] img = {R.id.image_ps_1,R.id.image_ps_2,R.id.image_ps_3,R.id.image_ps_4,R.id.image_ps_5,
            R.id.image_ps_6,R.id.image_ps_7,R.id.image_ps_8,R.id.image_ps_9,R.id.image_ps_10,
            R.id.image_ps_11,R.id.image_ps_12,R.id.image_ps_13,R.id.image_ps_14,R.id.image_ps_15,
            R.id.image_ps_16,R.id.image_ps_17,R.id.image_ps_18,R.id.image_ps_19,R.id.image_ps_20,
            R.id.image_ps_21,R.id.image_ps_22,R.id.image_ps_23,R.id.image_ps_24,R.id.image_ps_25};
*/




    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pungsun);

        for(int i=0; i<5;i++){

        }
/*
        ImageView img[] = new ImageView[24];
        img[0] = (ImageView)findViewById(R.id.image_ps_1);
        img[1] = (ImageView)findViewById(R.id.image_ps_2);
        img[2] = (ImageView)findViewById(R.id.image_ps_3);
        img[3] = (ImageView)findViewById(R.id.image_ps_4);
        img[4] = (ImageView)findViewById(R.id.image_ps_5);

        img[5] = (ImageView)findViewById(R.id.image_ps_6);
        img[6] = (ImageView)findViewById(R.id.image_ps_7);
        img[7] = (ImageView)findViewById(R.id.image_ps_8);
        img[8] = (ImageView)findViewById(R.id.image_ps_9);
        img[9] = (ImageView)findViewById(R.id.image_ps_10);

        img[10] = (ImageView)findViewById(R.id.image_ps_11);
        img[11] = (ImageView)findViewById(R.id.image_ps_12);
        img[12] = (ImageView)findViewById(R.id.image_ps_13);
        img[13] = (ImageView)findViewById(R.id.image_ps_14);
        img[14] = (ImageView)findViewById(R.id.image_ps_15);

        img[15] = (ImageView)findViewById(R.id.image_ps_16);
        img[16] = (ImageView)findViewById(R.id.image_ps_17);
        img[17] = (ImageView)findViewById(R.id.image_ps_18);
        img[18] = (ImageView)findViewById(R.id.image_ps_19);
        img[19] = (ImageView)findViewById(R.id.image_ps_20);

        img[20] = (ImageView)findViewById(R.id.image_ps_21);
        img[21] = (ImageView)findViewById(R.id.image_ps_22);
        img[22] = (ImageView)findViewById(R.id.image_ps_23);
        img[23] = (ImageView)findViewById(R.id.image_ps_24);
        img[24] = (ImageView)findViewById(R.id.image_ps_25);


*/
        final ImageView img1 = (ImageView)findViewById(R.id.image_ps_1);
        final ImageView img2 = (ImageView)findViewById(R.id.image_ps_2);
        final ImageView img3 = (ImageView)findViewById(R.id.image_ps_3);
        final ImageView img4 = (ImageView)findViewById(R.id.image_ps_4);
        final ImageView img5 = (ImageView)findViewById(R.id.image_ps_5);

        final ImageView img6 = (ImageView)findViewById(R.id.image_ps_6);
        final ImageView img7 = (ImageView)findViewById(R.id.image_ps_7);
        final ImageView img8 = (ImageView)findViewById(R.id.image_ps_8);
        final ImageView img9 = (ImageView)findViewById(R.id.image_ps_9);
        final ImageView img10 = (ImageView)findViewById(R.id.image_ps_10);

        final ImageView img11 = (ImageView)findViewById(R.id.image_ps_11);
        final ImageView img12 = (ImageView)findViewById(R.id.image_ps_12);
        final ImageView img13 = (ImageView)findViewById(R.id.image_ps_13);
        final ImageView img14 = (ImageView)findViewById(R.id.image_ps_14);
        final ImageView img15 = (ImageView)findViewById(R.id.image_ps_15);

        final ImageView img16 = (ImageView)findViewById(R.id.image_ps_16);
        final ImageView img17 = (ImageView)findViewById(R.id.image_ps_17);
        final ImageView img18 = (ImageView)findViewById(R.id.image_ps_18);
        final ImageView img19 = (ImageView)findViewById(R.id.image_ps_19);
        final ImageView img20 = (ImageView)findViewById(R.id.image_ps_20);

        final ImageView img21 = (ImageView)findViewById(R.id.image_ps_21);
        final ImageView img22 = (ImageView)findViewById(R.id.image_ps_22);
        final ImageView img23 = (ImageView)findViewById(R.id.image_ps_23);
        final ImageView img24 = (ImageView)findViewById(R.id.image_ps_24);
        final ImageView img25 = (ImageView)findViewById(R.id.image_ps_25);




//ran 배열

        img1.setImageResource(ran[a_1]);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img1.setImageResource(R.drawable.shot2);
            }
        });
        img2.setImageResource(ran[a_2]);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img2.setImageResource(R.drawable.shot2);
            }
        });
        img3.setImageResource(ran[a_3]);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img3.setImageResource(R.drawable.shot2);
            }
        });
        img4.setImageResource(ran[a_4]);
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img4.setImageResource(R.drawable.shot2);
            }
        });
        img5.setImageResource(ran[a_5]);
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img5.setImageResource(R.drawable.shot2);
            }
        });

        img6.setImageResource(ran[a_6]);
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img6.setImageResource(R.drawable.shot2);
            }
        });
        img7.setImageResource(ran[a_7]);
        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img7.setImageResource(R.drawable.shot2);
            }
        });
        img8.setImageResource(ran[a_8]);
        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img8.setImageResource(R.drawable.shot2);
            }
        });
        img9.setImageResource(ran[a_9]);
        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img9.setImageResource(R.drawable.shot2);
            }
        });
        img10.setImageResource(ran[a_10]);
        img10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img10.setImageResource(R.drawable.shot2);
            }
        });

        img11.setImageResource(ran[a_11]);
        img11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img11.setImageResource(R.drawable.shot2);
            }
        });
        img12.setImageResource(ran[a_12]);
        img12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img12.setImageResource(R.drawable.shot2);
            }
        });
        img13.setImageResource(ran[a_13]);
        img13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img13.setImageResource(R.drawable.shot2);
            }
        });
        img14.setImageResource(ran[a_14]);
        img14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img14.setImageResource(R.drawable.shot2);
            }
        });
        img15.setImageResource(ran[a_15]);
        img15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img15.setImageResource(R.drawable.shot2);
            }
        });

        img16.setImageResource(ran[a_16]);
        img16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img16.setImageResource(R.drawable.shot2);
            }
        });
        img17.setImageResource(ran[a_17]);
        img17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img17.setImageResource(R.drawable.shot2);
            }
        });
        img18.setImageResource(ran[a_18]);
        img18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img18.setImageResource(R.drawable.shot2);
            }
        });
        img19.setImageResource(ran[a_19]);
        img19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img19.setImageResource(R.drawable.shot2);
            }
        });
        img20.setImageResource(ran[a_20]);
        img20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img20.setImageResource(R.drawable.shot2);
            }
        });

        img21.setImageResource(ran[a_21]);
        img21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img21.setImageResource(R.drawable.shot2);
            }
        });
        img22.setImageResource(ran[a_22]);
        img22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img22.setImageResource(R.drawable.shot2);
            }
        });
        img23.setImageResource(ran[a_23]);
        img23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img23.setImageResource(R.drawable.shot2);
            }
        });
        img24.setImageResource(ran[a_24]);
        img24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img24.setImageResource(R.drawable.shot2);
            }
        });
        img25.setImageResource(ran[a_25]);
        img25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img25.setImageResource(R.drawable.shot2);
            }
        });







    }
}