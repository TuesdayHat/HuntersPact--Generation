package models;

/**
 * Created by Guest on 1/26/18.
 */
public class Generate extends Generator{


    private int randomDSix;

    public Generate(){
        randomDSix = dSix();
    }

    public int getRandomDSix(){
        return randomDSix;
    }
}
