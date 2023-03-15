package com.hmcoding.minsplit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public static int minSplit(int amount) {
        int[] coins = {50,20,10,5,1};
        int count=0; // მინიმალური საჭირო მონეტები
        int i=0;
        while(amount>0 && i<coins.length) {
            int coin=coins[i];
            if(coin<=amount) {
                int n = amount/coin;
                count+=n;
                amount-=n*coin;
            }
            i++;
        }
        return count;
    }

}