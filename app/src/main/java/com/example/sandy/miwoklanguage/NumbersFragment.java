package com.example.sandy.miwoklanguage;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class NumbersFragment extends Fragment {
    public NumbersFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_numbers, container, false);

        ArrayList<Word> numbers = new ArrayList<Word>();
        numbers.add(new Word("one", "lutti", R.drawable.number_one));
        numbers.add(new Word("two", "otiiko", R.drawable.number_two));
        numbers.add(new Word("three", "tolookosu", R.drawable.number_three));
        numbers.add(new Word("four", "oyyisa", R.drawable.number_four));
        numbers.add(new Word("five", "massokka", R.drawable.number_five));
        numbers.add(new Word("six", "temmokka", R.drawable.number_six));
        numbers.add(new Word("seven", "kenekaku", R.drawable.number_seven));
        numbers.add(new Word("eight", "kawinta", R.drawable.number_eight));
        numbers.add(new Word("nine", "wo’e", R.drawable.number_nine));
        numbers.add(new Word("ten", "na’aacha", R.drawable.number_ten));

        ListView layout = (ListView) rootView.findViewById(R.id.numbers_list);

        WordAdapter itemsAdapter = new WordAdapter(getActivity(), numbers, R.color.category_numbers);

        layout.setAdapter(itemsAdapter);

        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}
