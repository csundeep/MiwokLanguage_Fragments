package com.example.sandy.miwoklanguage;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class PhrasesFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_phrases, container, false);
        ArrayList<Word> numbers = new ArrayList<Word>();
        numbers.add(new Word("Where are you going?",
                "minto wuksus"));
        numbers.add(new Word("What is your name?", " tinnә oyaase 'nә"));
        numbers.add(new Word(" My name is...", "oyaaset..."));
        numbers.add(new Word(" How are you feeling?", " michәksәs ?"));
        numbers.add(new Word("I’m feeling good.", "kuchi achit"));
        numbers.add(new Word("Are you coming ?", "әәnәs 'aa?"));
        numbers.add(new Word("Yes, I’m coming.", "hәә’әәnәm"));
        numbers.add(new Word("I’m coming.", " әәnәm"));
        numbers.add(new Word("Let’s go.", "yoowutis"));
        numbers.add(new Word("Come here.", "әnni 'nem"));

        ListView layout = (ListView) rootView.findViewById(R.id.phrases_list);

        WordAdapter itemsAdapter = new WordAdapter(getActivity(), numbers, R.color.category_phrases);

        layout.setAdapter(itemsAdapter);
        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
    }


}
