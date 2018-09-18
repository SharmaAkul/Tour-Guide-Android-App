package com.example.android.myguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ManaliFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.guide_list, container, false);

        final ArrayList<Guide> words = new ArrayList<Guide>();
        words.add(new Guide(getString(R.string.solang), getString(R.string.desc4), R.drawable.solang));
        words.add(new Guide(getString(R.string.pass), getString(R.string.desc5), R.drawable.pass));
        words.add(new Guide(getString(R.string.temple), getString(R.string.desc6), R.drawable.temple));

        GuideAdapter adapter = new GuideAdapter(getActivity(), words);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}