package com.appgate.dtp.tdd.dojo;

public class Game {

    private int score;
    private int tries;
    private int round;

    public void roll(int i) {

        if (tries == 2)
            changeRound();


        if (i > 10 || i < 0) {
            throw new IllegalStateException("Error invalid pins take down");
        }
        tries += 1;
        if(tries>2){
            throw new IllegalStateException("Error invalid tries");
        }
        if (tries == 2) {
            round += 1;
        }
        score += i;
    }


    public int score() {
        return score;
    }

    public int round() {
        return round;
    }
    public void changeRound(){
        round +=1;
        tries=0;
    }
}

