package com.example.android.myguide;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class LehFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.guide_list, container, false);

        final ArrayList<Guide> words = new ArrayList<Guide>();
        words.add(new Guide(getString(R.string.zanskar), getString(R.string.desc7), R.drawable.zanskar));
        words.add(new Guide(getString(R.string.kargil), getString(R.string.desc8), R.drawable.kargil));
        words.add(new Guide(getString(R.string.nubra), getString(R.string.desc9), R.drawable.nubra));

        GuideAdapter adapter = new GuideAdapter(getActivity(), words);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}