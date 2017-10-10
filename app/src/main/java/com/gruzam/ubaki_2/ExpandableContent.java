package com.gruzam.ubaki_2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class ExpandableContent extends Activity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.expanable_layout);

        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);

        // Listview Group click listener
        expListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                Intent intentFilter = new Intent(ExpandableContent.this, ELearningAct.class);
                intentFilter.putExtra("Change", "True");
                ELearningAct fragmentAct = new ELearningAct();
                fragmentAct.throwValue(groupPosition, childPosition);
                startActivity(intentFilter);
                return false;
            }
        });
        };
    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("부모교육");
        listDataHeader.add("질병예방");
        listDataHeader.add("안전사고");

        // Adding child data
        List<String> parentes = new ArrayList<String>();
        parentes.add("영아기");
        parentes.add("유아기");


            List<String> prevention = new ArrayList<String>();
        prevention.add("신생아 태열");
        prevention.add("아토피 피부염");
        prevention.add("기저귀 발진");
        prevention.add("땀띠");
        prevention.add("유아 변비");

        List<String> accident = new ArrayList<String>();
        accident.add("응급처치 (심장 마사지)");
        accident.add("호흡정지 발작");
        accident.add("열성경련");

        listDataChild.put(listDataHeader.get(0), parentes); // Header, Child data
        listDataChild.put(listDataHeader.get(1), prevention);
        listDataChild.put(listDataHeader.get(2), accident);
    }
}