package com.example.ujiangameandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton btnUp, btnDown, btnRight, btnLeft;
    private CardView[] card = new CardView[16];

    int[][] movement = {
            {0,1,2,3}, {4,5,6,7}, {8,9,10,11}, {12,13,14,15},//rows
            {0,4,8,12}, {2,5,9,13}, {2,6,10,14}, {3,7,11,15},//columns
    };

    //black => 0
    //white => 1
    int[] blankCard = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnUp = findViewById(R.id.btn_up);
        btnDown = findViewById(R.id.btn_down);
        btnLeft = findViewById(R.id.btn_left);
        btnRight = findViewById(R.id.btn_right);

        //identify all cards id number
        for(int i = 0; i < card.length; i++){
            String cardID = "card_" + i;
            //to get id resource(necessary)
            int resourceID = getResources().getIdentifier(cardID,"id",getPackageName());
            card[i] = findViewById(resourceID);
        }

        btnUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Log.i("test", "button up");

            String cardID = v.getResources().getResourceEntryName(v.getId());
            int gameStart = Integer.parseInt(cardID.substring(cardID.length()-1), cardID.length());
            v.setBackgroundColor(Color.parseColor("#FF000000"));
            blankCard[gameStart] = 1;
            }

        });
        btnDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("test", "button down");
            }
        });
        btnLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("test", "button left");
            }
        });
        btnRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("test", "button right");
            }
        });

    }
}