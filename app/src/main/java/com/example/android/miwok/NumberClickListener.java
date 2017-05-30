package com.example.android.miwok;

import android.view.View;
import android.widget.Toast;

/**
 * Created by User on 2017-05-07.
 */

public class NumberClickListener implements View.OnClickListener {
    @Override
    public void onClick(View view){
        Toast.makeText(view.getContext(),"open",Toast.LENGTH_SHORT).show();
    }
}
