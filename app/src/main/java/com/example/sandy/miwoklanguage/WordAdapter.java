package com.example.sandy.miwoklanguage;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sandy on 14-02-2017.
 */
public class WordAdapter extends ArrayAdapter<Word> {

    private int colorResourceId;
    public WordAdapter(Activity context, ArrayList<Word> words,int colorResourceId) {
        super(context, 0, words);
        this.colorResourceId=colorResourceId;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        Word currentWord = getItem(position);


        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokTranslation());


        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultTranslation());
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image1);
        if (currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }
        else
            imageView.setVisibility(View.GONE);

        View textContainer=listItemView.findViewById(R.id.text_container);
        int color= ContextCompat.getColor(getContext(),colorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }


}
