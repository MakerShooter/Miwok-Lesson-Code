package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        String words[] = new String[10];
        words[7] = "seven";
        words[8] = "eight";

        Log.v("NumbersActivity", "Word at index 0: " + words[7]);
        int i = 0;
        while(i <10){
            Log.v("NumbersActivity", "Word at index "+i+" : " + words[i]);
            i++;

        }
        for(int n=0; i< words.length; n++){
            Log.v("NumbersActivity", "Word at index "+i+" : " + words[i]);
        }

        ArrayList<String> wordsArray = new ArrayList<String>();
        wordsArray.add("one");
        wordsArray.add("two");
        wordsArray.add("three");
        wordsArray.add("four");
        wordsArray.add("five");
        wordsArray.add("six");
        wordsArray.add("seven");
        wordsArray.add("eight");
        wordsArray.add("nine");
        wordsArray.add("ten");

        for(int n=0; i< wordsArray.size(); n++){
            Log.v("NumbersActivity", "Word at index "+n+" : " + wordsArray.get(n));
        }

        LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);
        TextView wordView = new TextView(this);
        wordView.setText(wordsArray.get(0));
        rootView.addView(wordView);

        int indexItem=0;
        while(indexItem<wordsArray.size()){
            TextView wordView1 = new TextView(this);
            wordView1.setText(wordsArray.get(indexItem));
            rootView.addView(wordView1);
        }


        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(itemsAdapter);
    }
}
