package com.example.cnjnuedux2020101335;

public class game {
    private final int[] rolls = new int[22];
    private int currentRoll = 0;

    public void roll(int i) {
        rolls[currentRoll++] = i;
    }

    public int score() {
        int score = 0;
        int frameIndex = 0;
        for (int frame = 0; frame < 10; frame++) {
            if (isSpare(frameIndex))
            {
                score += 10 + rolls[frameIndex + 2];
                frameIndex += 2;
            }else if(isStrike(frameIndex)){
                score += 10 +rolls[frameIndex+1]+rolls[frameIndex + 2];
                frameIndex += 1;
            }
            else {
                score += rolls[frameIndex] + rolls[frameIndex + 1];
                frameIndex += 2;
            }
        }
        return score;
    }

    private boolean isStrike(int frameIndex) {
        return rolls[frameIndex]==10;
    }

    private boolean isSpare(int frameIndex) {
        return rolls[frameIndex] +
                rolls[frameIndex + 1] == 10;

    }
}
