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
public class FactsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_layout, container, false);

        final ArrayList<Description> desc = new ArrayList<>();
        desc.add(new Description(getString(R.string.factHeader1),getString(R.string.factDesc1),Description.NO_IMAGE));
        desc.add(new Description(getString(R.string.factHeader2),getString(R.string.factDesc2),Description.NO_IMAGE));
        desc.add(new Description(getString(R.string.factHeader3),getString(R.string.factDesc3),Description.NO_IMAGE));
        desc.add(new Description(getString(R.string.factHeader4),getString(R.string.factDesc4),Description.NO_IMAGE));
        desc.add(new Description(getString(R.string.factHeader5),getString(R.string.factDesc5),Description.NO_IMAGE));
        DescriptionAdapter adapter = new DescriptionAdapter(getActivity(), desc, R.color.factsColor);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
