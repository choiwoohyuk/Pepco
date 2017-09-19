package com.gruzam.ubaki_2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

/**
 * Created by Administrator on 2017-09-14.
 */

public class exam_card extends Activity{
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.exam_card);

        Button bt_cs = (Button) findViewById(R.id.bt_cs);
        bt_cs.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(exam_card.this, com.gruzam.ubaki_2.Picturegame.class);
                        startActivity(intent);
                    }
                }
        );
    }}
