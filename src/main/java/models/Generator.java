package models;

import java.util.Random;

public abstract class Generator {

    public int dSix (int rolls){
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }



}
