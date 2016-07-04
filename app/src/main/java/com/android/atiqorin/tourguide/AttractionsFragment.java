package com.android.atiqorin.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by atiqorin on 7/3/16.
 */
public class AttractionsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_layout, container, false);

        final ArrayList<Description> desc = new ArrayList<>();
        desc.add(new Description(getString(R.string.attrHeader1),getString(R.string.attrDesc1),R.drawable.attr1));
        desc.add(new Description(getString(R.string.attrHeader2),getString(R.string.attrDesc2),R.drawable.attr2));
        desc.add(new Description(getString(R.string.attrHeader3),getString(R.string.attrDesc3),R.drawable.attr3));
        desc.add(new Description(getString(R.string.attrHeader4),getString(R.string.attrDesc4),R.drawable.attr4));
        desc.add(new Description(getString(R.string.attrHeader5),getString(R.string.attrDesc5),R.drawable.attr5));
        DescriptionAdapter adapter = new DescriptionAdapter(getActivity(), desc, R.color.attractionColor);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
