package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Word on 2017-06-08.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    private  int mColorId;

    public WordAdapter(Context context, ArrayList<Word> words) {
        super(context, 0, words);
    }
    public WordAdapter(Context context, ArrayList<Word> words, int color) {
        super(context, 0, words);
        this.mColorId = color;
    }

    public int getmColorId() {
        return mColorId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Word Word = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_items, parent, false);
        }
        // Lookup view for data population
        TextView miwork_text = (TextView) convertView.findViewById(R.id.miwork_text);
        TextView default_text = (TextView) convertView.findViewById(R.id.default_text);
        // Populate the data into the template view using the data object
        miwork_text.setText(Word.getmMiwokTranslation());
        default_text.setText(Word.getmDefaultTranslation());
        boolean isImageAvailable = Word.isImage();
        // Return the completed view to render on screen

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) convertView.findViewById(R.id.list_item_icon);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
      if(Word.isImage())
      {
       iconView.setVisibility(View.VISIBLE);
        iconView.setImageResource(Word.getmImageResourceId());
      }
        else
      {
          iconView.setVisibility(View.GONE);

      }

        convertView.setBackgroundResource(getmColorId());
        return convertView;

    }
}
