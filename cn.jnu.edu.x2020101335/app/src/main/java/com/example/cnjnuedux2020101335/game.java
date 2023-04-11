package com.example.cnjnuedux2020101335;

public class game {
    private  int score=0;
    public void roll(int pins) {
        score+=pins;
    }

    public int score() {
        return score;
    }
}
