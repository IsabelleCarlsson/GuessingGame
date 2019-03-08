package au.edu.jcu.cp3406.guessinggame;

import java.util.Random;

public class Game {
    private int randInt;
    private Random random = new Random();

    public Game() {
        newRand();
    }

    public int getRandInt() {
        return randInt;
    }

    public boolean check(int i) {
        return (i == randInt);
    }

    public void newRand() {
        randInt = random.nextInt(10) + 1;
    }
}
