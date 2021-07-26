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
    private CardView[][] card = new CardView[4][4];

    int x=0;
    int y=0;

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
            for(int j = 0; j<card.length;j++){
                String cardID = "card_" + i+j;
                card[i][j] = findViewById(getResources().getIdentifier(cardID,"id",getPackageName()));
            }
        }

        card[0][0].setCardBackgroundColor(Color.BLACK);

        btnUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Log.i("test", "button up");
            if((y<=3) && (y>0)){
                y=y-1;
            }
                if (card[y][x].getCardBackgroundColor().getDefaultColor() == Color.BLACK) {
                    card[y][x].setCardBackgroundColor(Color.WHITE);
                } else {
                    card[y][x].setCardBackgroundColor(Color.BLACK);
                }
            }

        });
        btnDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("test", "button down");
                if ((y < 3) && (y >= 0)) {
                    y = y + 1;
                }
                if (card[y][x].getCardBackgroundColor().getDefaultColor() == Color.BLACK) {
                    card[y][x].setCardBackgroundColor(Color.WHITE);
                } else {
                    card[y][x].setCardBackgroundColor(Color.BLACK);
                }
            }
        });
        btnLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("test", "button left");
                if((x<=3) && (x>0)){
                    x=x-1;

                }if (card[y][x].getCardBackgroundColor().getDefaultColor() == Color.BLACK) {
                    card[y][x].setCardBackgroundColor(Color.WHITE);
                } else {
                    card[y][x].setCardBackgroundColor(Color.BLACK);
                }
            }
        });
        btnRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("test", "button right");

                if((x<3)&&(x>=0)){
                    x=x+1;
                }if (card[y][x].getCardBackgroundColor().getDefaultColor() == Color.BLACK) {
                    card[y][x].setCardBackgroundColor(Color.WHITE);
                } else {
                    card[y][x].setCardBackgroundColor(Color.BLACK);
                }
            }
        });

    }
}