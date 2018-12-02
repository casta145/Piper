package com.example.alfonsoc.piper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HomeFragment extends Fragment {

    List<HashMap<String, String>> aList;
    ListView listView;
    SimpleAdapter simpleAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    /*@Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        from https://www.tutorialspoint.com/android/android_list_fragment.htm
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.Planets, android.R.layout.simple_list_item_1);
        setListAdapter(adapter);


        from HCI FridgeMe Project
        aList = new ArrayList<HashMap<String, String>>();
        aList.clear();

        for (int i = 0; i < Profile.txtPosts.size(); ++i) {
            String title = Profile.titles.get(i);
            String description = Profile.txtPosts.get(i);

            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("listview_title", title);
            hm.put("listview_description", description);
            hm.put("listview_image", Integer.toString(R.mipmap.ic_launcher));
            aList.add(hm);
        }

        String[] from = {"listview_image", "listview_title", "listview_description"};
        int[] to = {R.id.listview_image, R.id.listview_item_title, R.id.listview_description};

        simpleAdapter = new SimpleAdapter(this.getContext(), aList, R.layout.activity_text_listview, from, to);
        listView = getView().findViewById(R.id.list_view);
        listView.setAdapter(simpleAdapter);
    }*/
}