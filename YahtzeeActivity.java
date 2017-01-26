package com.example.gbingham18.yahtzee;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Space;
//import android.widget.

import java.net.URL;
import java.util.ArrayList;
import java.util.Random;

public class YahtzeeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yahtzee);
        ArrayList<Image> images = new ArrayList<Image>();
        ArrayList<Space> spaces = new ArrayList<Space>();

        Image Dice1 = (Image) findViewById(R.id.dice1);
        images.add(Dice1);
        Image Dice2 = (Image) findViewById(R.id.dice2);
        images.add(Dice2);
        Image Dice3 = (Image) findViewById(R.id.dice3);
        images.add(Dice3);
        Image Dice4 = (Image) findViewById(R.id.dice4);
        images.add(Dice4);
        Image Dice5 = (Image) findViewById(R.id.dice5);
        images.add(Dice5);
        Image Dice6 = (Image) findViewById(R.id.dice6);
        images.add(Dice6);

        Space space1 = (Space) findViewById(R.id.space1);
        spaces.add(space1);
        Space space2 = (Space) findViewById(R.id.space2);
        spaces.add(space2);
        Space space3 = (Space) findViewById(R.id.space3);
        spaces.add(space3);
        Space space4 = (Space) findViewById(R.id.space4);
        spaces.add(space4);
        Space space5 = (Space) findViewById(R.id.space5);
        spaces.add(space5);

        Button newButton = (Button) findViewById(R.id.YahtzeeButton);
        newButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               for(int i = 0; i < 5; i++)
               {
                   Random rand = new Random();
                   int x = rand.nextInt(6) + 1;

                   spaces.get(i).

               }
            }
        });

    }
}
