package com.android.atiqorin.tourguide;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by atiqorin on 7/4/16.
 */
public class DescriptionAdapter extends ArrayAdapter<Description> {

    int mColorResourceId;
    public DescriptionAdapter(Context context, ArrayList<Description> descs, int colorResourceId) {
        super(context, 0, descs);
        mColorResourceId = colorResourceId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Description currentDesc = getItem(position);
        TextView headerTextView = (TextView) listItemView.findViewById(R.id.header_text_view);
        headerTextView.setText(currentDesc.getHeader());
        TextView descTextView = (TextView) listItemView.findViewById(R.id.desc_text_view);
        descTextView.setText(currentDesc.getDesc());
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentDesc.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentDesc.getmImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }
        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);
        return listItemView;

    }
}
