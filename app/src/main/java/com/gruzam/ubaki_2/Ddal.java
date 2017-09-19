package com.gruzam.ubaki_2;

import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Created by CWH-PC on 2017-07-04.
 */

public class Ddal extends Activity implements SensorEventListener{

    private long lastTime;
    private float speed;
    private float lastX;
    private float lastY;
    private float lastZ;
    private float x, y, z;

    private static final int SHAKE_THRESHOLD = 800;
    private static final int DATA_X = SensorManager.DATA_X;
    private static final int DATA_Y = SensorManager.DATA_Y;
    private static final int DATA_Z = SensorManager.DATA_Z;

    private SensorManager sensorManager;
    private Sensor accelerormeterSensor;

    SoundPool pool;
    int m1;
    //MediaPlayer meidadal1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ddal);

        pool = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        m1 = pool.load(this, R.raw.mediaddal1, 1);

        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        accelerormeterSensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

        ImageView imgdalang = (ImageView)findViewById(R.id.img_ddal);
        imgdalang.setImageResource(R.drawable.ddal_ddal);

    }


    @Override
    public void onStart() {
        super.onStart();
        if (accelerormeterSensor != null)
            sensorManager.registerListener(this, accelerormeterSensor,
                    SensorManager.SENSOR_DELAY_GAME);
    }


    @Override
    public void onStop() {
        super.onStop();
        if (sensorManager != null)
            sensorManager.unregisterListener(this);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }


    @Override
    public void onSensorChanged(SensorEvent event) {

        if (event.sensor.getType() == Sensor.TYPE_ACCELEROMETER) {
            long currentTime = System.currentTimeMillis();
            long gabOfTime = (currentTime - lastTime);
            if (gabOfTime > 100) {
                lastTime = currentTime;
                x = event.values[SensorManager.DATA_X];
                y = event.values[SensorManager.DATA_Y];
                z = event.values[SensorManager.DATA_Z];

                speed = Math.abs(x + y + z - lastX - lastY - lastZ) / gabOfTime * 10000;

                if (speed > SHAKE_THRESHOLD) {
                    if(m1 != 0) {
                        pool.play(m1, 1, 1, 0, 0, 1);

                    }
                    else{
                        pool.stop(m1);
                    }



                    // 이벤트발생!!
                }

                lastX = event.values[DATA_X];
                lastY = event.values[DATA_Y];
                lastZ = event.values[DATA_Z];
            }

        }

    }














   /* TextView ax,ay,az;
    SensorManager sm;
    SensorEventListener accL;
    Sensor accSensor;

    SoundPool pool;
    int m1;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ddal);

        pool = new SoundPool(8, AudioManager.STREAM_MUSIC, 0);
        m1 = pool.load(this, R.raw.mediax1, 1);

//----------------------------좌표-----------
        sm = (SensorManager)getSystemService(SENSOR_SERVICE);
        accSensor = sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

        accL = new accListener();

        ax = (TextView)findViewById(R.id.acc_x);
        ay = (TextView)findViewById(R.id.acc_y);
        az = (TextView)findViewById(R.id.acc_z);
        //----------------------------------------
    }

    @Override
    protected void onPause(){
        super.onPause();
        sm.unregisterListener(accL);


    }

    @Override
    protected void onResume(){
        super.onResume();
        sm.registerListener(accL, accSensor, SensorManager.SENSOR_DELAY_NORMAL);

    }


    private class accListener implements SensorEventListener{

        @Override
        public void onSensorChanged(SensorEvent event) {
            ax.setText(Float.toString(event.values[0]));
            ay.setText(Float.toString(event.values[1]));
            az.setText(Float.toString(event.values[2]));

            if(ax){
                pool.play(m1,1,1,0,0,1);
            }

            Log.i("SENSOR", "Acceleration changed.");
            Log.i("SENSOR", "  Acceleration X: " + event.values[0]
                    + ", Acceleration Y: " + event.values[1]
                    + ", Acceleration Z: " + event.values[2]);


        }
        */
/*
        @Override
        public void onAccuracyChanged(Sensor sensor, int accuracy) {

        }
    }
*/
}