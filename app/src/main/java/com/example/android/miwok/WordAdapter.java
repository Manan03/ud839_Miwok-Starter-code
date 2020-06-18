package com.example.android.miwok;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class WordAdapter extends ArrayAdapter<Word> {
    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> word, int colorResourceId) {
        super(context, 0, word);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word local_word = getItem(position);
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.list_tv_miwok);
        miwokTextView.setText(local_word.getMiwokTranslataion());
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.list_tv_english);
        defaultTextView.setText(local_word.getDefaultTranslataion());
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if(local_word.hasImage()) {
            imageView.setVisibility(View.VISIBLE);
            imageView.setImageResource(local_word.getResourceId());
        }
        else {
            imageView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);



        return listItemView;
    }
}
