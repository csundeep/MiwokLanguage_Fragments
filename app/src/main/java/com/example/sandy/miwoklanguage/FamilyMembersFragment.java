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


public class FamilyMembersFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_family_members, container, false);
        ArrayList<Word> numbers = new ArrayList<Word>();
        numbers.add(new Word("father", "әpә", R.drawable.family_father));
        numbers.add(new Word("mother", "әṭa", R.drawable.family_mother));
        numbers.add(new Word("son", "angsi", R.drawable.family_son));
        numbers.add(new Word("daughter", "tune", R.drawable.family_daughter));
        numbers.add(new Word("older brother", "taachi", R.drawable.family_older_brother));
        numbers.add(new Word("younger brother", "chalitti", R.drawable.family_younger_brother));
        numbers.add(new Word("older sister", "teṭe", R.drawable.family_older_sister));
        numbers.add(new Word("younger sister", "kolliti", R.drawable.family_younger_sister));
        numbers.add(new Word("grandmother", "ama", R.drawable.family_grandmother));
        numbers.add(new Word("grandfather", "paapa", R.drawable.family_grandfather));

        ListView layout = (ListView) rootView.findViewById(R.id.family_members_list);

        WordAdapter itemsAdapter = new WordAdapter(getActivity(), numbers, R.color.category_family);

        layout.setAdapter(itemsAdapter);
        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
    }


}
