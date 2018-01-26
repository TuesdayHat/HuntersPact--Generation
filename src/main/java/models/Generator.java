package models;

import java.util.Random;

public abstract class Generator {


    public int dSix (){
        Random rand = new Random();
        return rand.nextInt(7) + 1;
    }

}
