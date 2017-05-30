/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView numbers, families, phrases, colors;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //create the listener for the click action
        NumberClickListener listener = new NumberClickListener();
        //inicialization of the TextView for nubmers
       numbers = (TextView)findViewById(R.id.numbers);
        families = (TextView)findViewById(R.id.family);
        phrases = (TextView)findViewById(R.id.phrases);
        colors = (TextView)findViewById(R.id.colors);

        //attaching the lister to the texview
        //numbers.setOnClickListener(listener);
        //to be more concise use this: - you don't have to initialize the class
     //   numbers.setOnClickListener(new NumberClickListener());

        //not to create the additional class
        numbers.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(view.getContext(),"open numbers",Toast.LENGTH_SHORT).show();
                //start new intend
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
            }

        });
        //not to create the additional class
        families.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(view.getContext(),"open family",Toast.LENGTH_SHORT).show();
                //start new intend
                Intent numbersIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(numbersIntent);
            }

        });

        //not to create the additional class
        colors.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(view.getContext(),"open colors",Toast.LENGTH_SHORT).show();
                //start new intend
                Intent numbersIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(numbersIntent);
            }

        });
        //not to create the additional class
        phrases.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(view.getContext(),"open phrases",Toast.LENGTH_SHORT).show();
                //start new intend
                Intent numbersIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(numbersIntent);
            }

        });
    }
    public void callNumbers(View view){
        //start new intend
        Intent i = new Intent(this, NumbersActivity.class);
        startActivity(i);

    }
    public void callFamily(View view){
        //start new intend
        Intent i = new Intent(this, FamilyActivity.class);
        startActivity(i);

    }
    public void callColors(View view){
        //start new intend
        Intent i = new Intent(this, ColorsActivity.class);
        startActivity(i);

    }
    public void callPhrases(View view){
        //start new intend
        Intent i = new Intent(this, PhrasesActivity.class);
        startActivity(i);

    }
}
