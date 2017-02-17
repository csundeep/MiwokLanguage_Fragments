package com.example.sandy.miwoklanguage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class ColorsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_colors, container, false);

        ArrayList<Word> numbers = new ArrayList<Word>();
        numbers.add(new Word("red", "weṭeṭṭi", R.drawable.color_red));
        numbers.add(new Word("green", "chokokki", R.drawable.color_green));
        numbers.add(new Word("brown", "ṭakaakki", R.drawable.color_brown));
        numbers.add(new Word("gray", "ṭopoppi", R.drawable.color_gray));
        numbers.add(new Word("black", "kululli", R.drawable.color_black));
        numbers.add(new Word("white", "kelelli", R.drawable.color_white));
        numbers.add(new Word("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow));
        numbers.add(new Word("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow));


        ListView layout = (ListView) rootView.findViewById(R.id.colors_list);

        WordAdapter itemsAdapter = new WordAdapter(getActivity(), numbers, R.color.category_colors);

        layout.setAdapter(itemsAdapter);

        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
    }

}
