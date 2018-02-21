package com.example.android.basketballgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA;
    int scoreTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    //team A score
    public void displayForTeamA(int score) {
        TextView scoreViewA = findViewById(R.id.team_a_score);
        scoreViewA.setText(String.valueOf(score));
    }

    //increment score with 3 points
    public void increment3PointsA(View view) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    //increment score with 2 points
    public void increment2PointsA(View view) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    //increment score with one point
    public void increment1PointA(View view) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    //    team B score
    public void displayForTeamB(int score) {
        TextView scoreViewB = findViewById(R.id.team_b_score);
        scoreViewB.setText(String.valueOf(score));
    }

    //increment score with 3 points
    public void increment3PointsB(View view) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    //increment score with 2 points
    public void increment2PointsB(View view) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    //increment score with 1 point
    public void increment1PointB(View view) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    //reset score for both teams
    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
