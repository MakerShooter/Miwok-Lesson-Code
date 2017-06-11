package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.android.miwok.R.layout.word_list;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        setContentView(word_list);



        ArrayList<Word> colors = new ArrayList<Word>();
        Word w = new Word("one", "lutti");
        colors.add(w);


        colors.add(new Word("red", "lutti"));
        colors.add(new Word("green", "lutti"));
        colors.add(new Word("brown", "lutti"));
        colors.add(new Word("gray", "lutti"));
        colors.add(new Word("five", "lutti"));
        colors.add(new Word("six", "lutti"));
        colors.add(new Word("seven", "lutti"));
        colors.add(new Word("eight", "lutti"));
        colors.add(new Word("nine", "lutti"));
        colors.add(new Word("ten", "lutti"));


        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        WordAdapter  adapter = new WordAdapter(this, colors);

        // new ArrayAdapter<Word>(this, R.layout.list_items, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_listyout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

    }
}
