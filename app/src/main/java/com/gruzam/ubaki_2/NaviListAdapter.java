package com.gruzam.ubaki_2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by powwl on 2017-08-06.
 */

public class NaviListAdapter extends BaseExpandableListAdapter {
    private Context mContext;
    private ArrayList<String> mParentList;
    private HashMap<String, ArrayList<String>> mChildHashMap;
    public int mlistHeight;

    public NaviListAdapter(Context context, ArrayList<String> parentList, HashMap<String, ArrayList<String>> childList, int listHeight){
        this.mContext = context;
        this.mParentList = parentList;
        this.mChildHashMap = childList;
        mlistHeight = (int) listHeight/(mChildHashMap.size()+mParentList.size());
    }

    //부모 리스트 생성

    @Override
    public String getGroup(int groupPosition) {
        return mParentList.get(groupPosition);
    }

    @Override
    public int getGroupCount() {
        return mParentList.size();
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        if(convertView == null){
            LayoutInflater groupInfla = (LayoutInflater) this.mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            // ParentList의 layout 연결. root로 argument 중 parent를 받으며 root로 고정하지는 않음
            convertView = groupInfla.inflate(R.layout.listitem, parent, false);
        }
        TextView parentText = (TextView)convertView.findViewById(R.id.list_item);
        parentText.setHeight(mlistHeight);
        parentText.setText(getGroup(groupPosition));
        return convertView;
    }

    //자식 리스트 생성
    @Override
    public String getChild(int groupPosition, int childPosition) {
        return this.mChildHashMap.get(this.mParentList.get(groupPosition)).get(childPosition);
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return this.mChildHashMap.get(this.mParentList.get(groupPosition)).size();
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        if(convertView == null){
            LayoutInflater childfla = (LayoutInflater) this.mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = childfla.inflate(R.layout.listitem, null);
        }

        TextView childText = (TextView)convertView.findViewById(R.id.list_item);
        childText.setHeight(mlistHeight-50);
        childText.setText(getChild(groupPosition, childPosition));
        return convertView;
    }


    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
