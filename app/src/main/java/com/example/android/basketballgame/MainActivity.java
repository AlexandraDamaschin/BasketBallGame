package com.example.android.basketballgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    int team_a_score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA (team_a_score);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void increment3Points (View view){
        team_a_score += 3;
        displayForTeamA(team_a_score);
    }

    public void increment2Points (View view){
        team_a_score += 2;
        displayForTeamA(team_a_score);
    }

    public void increment1Point (View view){
        team_a_score += 1;
        displayForTeamA(team_a_score);
    }
}
