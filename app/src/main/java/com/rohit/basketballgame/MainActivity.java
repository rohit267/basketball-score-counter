package com.rohit.basketballgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA=0;
    int scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //display(4,"a");

    }

    public void display(int score, int t){
        //TextView te = (TextView) findViewById(R.id.team_a_score);
        //te.setText(String.valueOf(score));

        if(t ==1){
            TextView te = (TextView) findViewById(R.id.team_a_score);
            te.setText(String.valueOf(score));
        }
        if(t ==2){
            TextView te= (TextView) findViewById(R.id.team_b_score);
            te.setText(String.valueOf(score));
        }

    }


    public void score(View v){
        String tag= v.getTag().toString();
        String[] t=  tag.split(",",2);
        int team=Integer.parseInt(t[1]);
        //System.out.println(t);
        int inc=Integer.parseInt(t[0]);
        if(team==1){
            scoreA=scoreA+inc;
            display(scoreA,team);
        }
        if (team==2){
            scoreB=scoreB+inc;
            display(scoreB,team);
        }

    }
    public void reset(View v){
        scoreA=0;
        scoreB=0;
        display(scoreA,1);
        display(scoreB,2);
    }

}
