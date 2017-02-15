package com.example.sandy.miwoklanguage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbersTextView=(TextView)findViewById(R.id.numbers);
        numbersTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Open list of numbers", Toast.LENGTH_SHORT).show();
                openNumbersList(v);
            }
        });

        TextView familyMembersTextView=(TextView)findViewById(R.id.family);
        familyMembersTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Open list of Family members", Toast.LENGTH_SHORT).show();
                openFamilyMembersList(v);
            }
        });


        TextView colorsTextView=(TextView)findViewById(R.id.colors);
        colorsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Open list of colors", Toast.LENGTH_SHORT).show();
                openColorsList(v);
            }
        });


        TextView PhrasesTextView=(TextView)findViewById(R.id.phrases);
        PhrasesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Open list of phrases", Toast.LENGTH_SHORT).show();
                openPhrasesList(v);
            }
        });
    }

    private void openNumbersList(View view) {
        Intent intent = new Intent(this, NumbersActivity.class);
        startActivity(intent);
    }

    private void openFamilyMembersList(View view) {
        Intent intent = new Intent(this, FamilyMembersActivity.class);
        startActivity(intent);
    }

    private void openColorsList(View view) {
        Intent intent = new Intent(this, ColorsActivity.class);
        startActivity(intent);
    }

    private void openPhrasesList(View view) {
        Intent intent = new Intent(this, PhrasesActivity.class);
        startActivity(intent);
    }
}
