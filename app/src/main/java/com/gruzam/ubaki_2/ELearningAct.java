package com.gruzam.ubaki_2;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Point;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Display;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class ELearningAct extends AppCompatActivity{
    //NavigationDrawer value
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mDrawToggle;
    private Toolbar toolbar;
    public ExpandableListView mlistView;
    public NaviListAdapter mNaviListAdpater;
    public ArrayList<String> mParentList, parentes, prevention, accident;
    public HashMap<String, ArrayList<String>> childList;
    int listHeight;
    //Fragment value
    public FragmentManager mFManager;
    public FragmentTransaction mFTrans;
    public ArrayList<Integer> fragmentLayout, cp1Layout, cp2Layout, cp3Layout;
    public HashMap<Integer, ArrayList<Integer>> fragmentMap;
    BlankFragment chapter1;
    BlankFragment2 chapter2;
    BlankFragment3 chapter3;
    int parentCount, childCount;
    String yNo;

    //Media
    MediaPlayer mMediaPlayer;
    SeekBar mSeekbar;
    Handler mHandler;
    Runnable mRunable;
    TextView tMax, tMusic;
    Button ssButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.e_learningactivity);
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mHandler = new Handler();

        //Set fragment
        changeFragement();

        //first Fragment
        mMediaPlayer = new MediaPlayer();
        Intent intent = getIntent();
        yNo = intent.getExtras().getString("Change");
        if(yNo.equals("True")){
            checkFragment(parentCount, childCount);
            MediaInit(fragmentMap.get(fragmentLayout.get(parentCount)).get(childCount), parentCount);/*childCount 나중에 수정*/
            yNo = "False";
        }

        //NavigationDrawer and ExpanedableListView Setting
        NavigationItems();

    }

    public void NavigationItems(){
        // parentList 데이터 입력
        mParentList = new ArrayList<String>();
        mParentList.add("부모교육");
        mParentList.add("질병예방");
        mParentList.add("안전사고");

        // parentlist에 속할 childList 값 생성
        parentes = new ArrayList<String>();
        parentes.add("영아기");
        parentes.add("유아기");

        prevention = new ArrayList<String>();
        prevention.add("신생아 태열");
        prevention.add("아토피 피부염");
        prevention.add("기저귀 발진");
        prevention.add("땀띠");
        prevention.add("유아 변비");



        accident = new ArrayList<String>();
        accident.add("응급처치 (심장 마사지)");
        accident.add("호흡정지 발작");
        accident.add("열성경련");

        // parentList에 대한 childList 배정
        childList = new HashMap<String,ArrayList<String>>();
        childList.put(mParentList.get(0), parentes);
        childList.put(mParentList.get(1), prevention);
        childList.put(mParentList.get(2), accident);

        // Navigation에 대한 Layout설정
        mDrawerLayout = (DrawerLayout) findViewById(R.id.navi);
        mDrawToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close)
        {
            @Override
            public void onDrawerOpened(View drawerView){
                super.onDrawerOpened(drawerView);
            }

            @Override
            public void onDrawerClosed(View drawerView){
                super.onDrawerClosed(drawerView);
            }
        };
        mDrawerLayout.addDrawerListener(mDrawToggle);
        mDrawToggle.syncState();

        listHeight = getScreenSize(this).y;

        // Navigation내의 리스트뷰
        mlistView = (ExpandableListView)findViewById(R.id.mainlist);
        mNaviListAdpater = new NaviListAdapter(this, mParentList, childList, listHeight);
        mlistView.setAdapter(mNaviListAdpater);

        // 그룹이 펼쳐질때의 이벤트 설정
        mlistView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener(){

            @Override
            public void onGroupExpand(int groupPosition) {

            }
        });

        // 그룹이 접혀질때의 이벤트 설정
        mlistView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {
            @Override
            public void onGroupCollapse(int groupPosition) {

            }
        });

        // 자식 리스트 클릭시 이벤트
        mlistView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                int lerningMusic = fragmentMap.get(fragmentLayout.get(groupPosition)).get(childPosition);
                checkFragment(groupPosition, childPosition);
                MediaInit(lerningMusic, groupPosition);/*childPosition 나중에 수정*/
                return false;
            }
        });
    }

    public void checkFragment(int groupPosition, int childPosition){

        switch (childPosition){
            case 0:
                if(groupPosition==1){
                    chapter1.newInstance("Major", "learning_chapter1_1");
                    chapter1.newLayout(fragmentLayout.get(groupPosition));
                    mFTrans.replace(R.id.fragment_contents, chapter1);

                }else if(groupPosition==2){
                    chapter2.newInstance("Major", "learning_chapter2_1");
                    chapter2.newLayout(fragmentLayout.get(groupPosition));
                    mFTrans.replace(R.id.fragment_contents, chapter2);

                }else if(groupPosition==3){
                    chapter3.newInstance("Major", "learning_chapter3_1");
                    chapter3.newLayout(fragmentLayout.get(groupPosition));
                    mFTrans.replace(R.id.fragment_contents, chapter2);


                }

                break;
            case 1:
                if(groupPosition==1){
                    chapter1.newInstance("Major", "learning_chapter1_2");
                    chapter1.newLayout(fragmentLayout.get(groupPosition));
                    mFTrans.replace(R.id.fragment_contents, chapter1);

                }else if(groupPosition==2){
                    chapter2.newInstance("Major", "learning_chapter2_2");
                    chapter2.newLayout(fragmentLayout.get(groupPosition));
                    mFTrans.replace(R.id.fragment_contents, chapter2);


                }else if(groupPosition==3){
                    chapter3.newInstance("Major", "learning_chapter3_2");
                    chapter3.newLayout(fragmentLayout.get(groupPosition));
                    mFTrans.replace(R.id.fragment_contents, chapter2);

                }

                break;
            case 2:
                if(groupPosition==2){
                    chapter2.newInstance("Major", "learning_chapter2_3");
                    chapter2.newLayout(fragmentLayout.get(groupPosition));
                    mFTrans.replace(R.id.fragment_contents, chapter2);


                }else if(groupPosition==3){
                    chapter3.newInstance("Major", "learning_chapter3_3");
                    chapter3.newLayout(fragmentLayout.get(groupPosition));
                    mFTrans.replace(R.id.fragment_contents, chapter2);

                }

                break;
            case 3:
                chapter2.newInstance("Major", "learning_chapter2_4");
                chapter2.newLayout(fragmentLayout.get(groupPosition));
                mFTrans.replace(R.id.fragment_contents, chapter2);


                break;
            case 4:
                chapter2.newInstance("Major","learning_chapter2_5");
                chapter2.newLayout(fragmentLayout.get(groupPosition));
                mFTrans.replace(R.id.fragment_contents, chapter2);

                break;
            default:
                mFTrans.setTransition(FragmentTransaction.TRANSIT_ENTER_MASK);
                mFTrans.commit();
        }
    }


    //fragment content
    public void changeFragement(){
        //Fragment setting
        fragmentLayout = new ArrayList<Integer>();
        fragmentLayout.add(R.layout.learning_chapter1);
        fragmentLayout.add(R.layout.learning_chapter2);
        fragmentLayout.add(R.layout.learning_chapter3);

        // 나중에 수정
        cp1Layout = new ArrayList<Integer>();
        cp1Layout.add(R.raw.test_music);
        cp1Layout.add(R.raw.test_music);

        cp2Layout = new ArrayList<Integer>();
        cp2Layout.add(R.raw.test_music);
        cp2Layout.add(R.raw.test_music);
        cp2Layout.add(R.raw.test_music);
        cp2Layout.add(R.raw.test_music);
        cp2Layout.add(R.raw.test_music);

        cp3Layout = new ArrayList<Integer>();
        cp3Layout.add(R.raw.test_music);
        cp3Layout.add(R.raw.test_music);
        cp3Layout.add(R.raw.test_music);

        fragmentMap = new HashMap<Integer, ArrayList<Integer>>();
        fragmentMap.put(fragmentLayout.get(0), cp1Layout);
        fragmentMap.put(fragmentLayout.get(1), cp2Layout);
        fragmentMap.put(fragmentLayout.get(2), cp3Layout);


        mFManager = getSupportFragmentManager();
        mFTrans = mFManager.beginTransaction();
        chapter1 = new BlankFragment();
        chapter2 = new BlankFragment2();
        chapter3 = new BlankFragment3();


    }

    // 액션바토글이 계속해서 동기화될 수 있도록 메소드 추가
    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mDrawToggle.syncState();
    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mDrawToggle.onConfigurationChanged(newConfig);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(mDrawToggle.onOptionsItemSelected(item))
            return true;
        return super.onOptionsItemSelected(item);
    }

    // Display size
    public Point getScreenSize(Activity activity){
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        return size;
    }

    //Before layout throw value
    public void throwValue(int parentCount, int childCount){
        this.parentCount = parentCount;
        this.childCount = childCount;
    }

    //Media circle
    public void mediaCircle(){
        mSeekbar.setProgress(mMediaPlayer.getCurrentPosition());
        int m = mMediaPlayer.getCurrentPosition()/60000;
        int s = (mMediaPlayer.getCurrentPosition()%60000)/1000;
        tMusic.setText(m+":"+s);
        if(mMediaPlayer.isPlaying()){
            mRunable = new Runnable() {
                @Override
                public void run() {
                    mediaCircle();

                }
            };
            mHandler.postDelayed(mRunable, 1000);
        }
    }
    //MediaPlayer Init setting
    public void MediaInit(int lMusic, final int Count){
        mSeekbar = (SeekBar) findViewById(R.id.learning_seekbar);
        mSeekbar.setProgress(0);
        if(mMediaPlayer!=null) {
            if (mMediaPlayer.isPlaying()) {
                mMediaPlayer.stop();
                mMediaPlayer.release();
            }
        }
        try {
            mMediaPlayer = MediaPlayer.create(ELearningAct.this, lMusic);
            mMediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mediaPlayer) {
                    mSeekbar.setMax(mMediaPlayer.getDuration());
                    tMax = (TextView) findViewById(R.id.timmer_max);
                    int mMax = mSeekbar.getMax()/60000;
                    int sMax = (mSeekbar.getMax()%60000)/1000;
                    tMax.setText(mMax+":"+sMax);
                    mMediaPlayer.start();
                    mediaCircle();
                }
            });

        } catch (Exception e){
            Toast toast = Toast.makeText (this, e.getMessage(), Toast.LENGTH_SHORT);
            toast.show();
        }
        mMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mMediaPlayer.stop();
                if(mSeekbar.getProgress() == mSeekbar.getMax()) {
                    alertdialog Question = new alertdialog();
                    Question.initQuestion(Count, ELearningAct.this);
                    Question.alertdialog();
                    Question.makeQuiz();
                }
            }
        });

        tMusic = (TextView) findViewById(R.id.timmer_music);
        mSeekbar.setMinimumWidth(getScreenSize(this).x-500);
        mSeekbar.setVisibility(ProgressBar.VISIBLE);
        ssButton = (Button) findViewById(R.id.ss_button);
        ssButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mMediaPlayer.isPlaying()){
                    isPlay();
                }else {
                    isPlay();
                }
            }
        });

        mSeekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int prograss, boolean input) {
                if(!mMediaPlayer.isPlaying()){
                    mMediaPlayer.start();
                }
                if(input) {
                    mMediaPlayer.seekTo(prograss);
                    mSeekbar.setProgress(prograss);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    private void isPlay(){
        if(mMediaPlayer!=null) {
            ssButton.getBackground();
            if (!mMediaPlayer.isPlaying()) {
                mMediaPlayer.start();
                ssButton.setBackground(ContextCompat.getDrawable(this, R.drawable.play));
            } else {
                mMediaPlayer.stop();
                ssButton.setBackground(ContextCompat.getDrawable(this, R.drawable.pause));
            }
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if(mMediaPlayer!=null) {
            mMediaPlayer.start();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if(mMediaPlayer!=null) {
            mMediaPlayer.pause();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mMediaPlayer.stop();
        mMediaPlayer.release();
        mHandler.removeCallbacks(mRunable);
    }
}
