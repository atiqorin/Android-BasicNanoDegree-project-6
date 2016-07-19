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
public class FoodFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_layout, container, false);

        final ArrayList<Description> desc = new ArrayList<>();
        desc.add(new Description(getString(R.string.foodHeader1),getString(R.string.foodDesc1),Description.NO_IMAGE));
        desc.add(new Description(getString(R.string.foodHeader2),getString(R.string.foodDesc2),Description.NO_IMAGE));
        desc.add(new Description(getString(R.string.foodHeader3),getString(R.string.foodDesc3),Description.NO_IMAGE));
        desc.add(new Description(getString(R.string.foodHeader4),getString(R.string.foodDesc4),Description.NO_IMAGE));
        desc.add(new Description(getString(R.string.foodHeader5),getString(R.string.foodDesc5),Description.NO_IMAGE));
        DescriptionAdapter adapter = new DescriptionAdapter(getActivity(), desc, R.color.foodColor);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
