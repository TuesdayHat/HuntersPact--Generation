package models;

import java.util.Arrays;

/**
 * Created by Guest on 1/26/18.
 */
public class Generate extends Generator{


    public void setPossible(String... args){
        this.possible = Arrays.asList(args);
    }

    public int getRandomDSix(){
        return dSix(1);
    }

    public int getXDSix(int num){
        return dSix(num);
    }

    public Object getItem(){
        return randPick(this.possible);
    }
}
