package models;

import java.util.Random;

public abstract class Generator {

    public int dSix (int rolls){
        Random rand = new Random();
        int result = 0;
        for (int i=0; i< rolls; i++){
            result += rand.nextInt(6);
        }
        return result;
    }



}
