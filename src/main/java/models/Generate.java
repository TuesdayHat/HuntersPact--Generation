package models;

/**
 * Created by Guest on 1/26/18.
 */
public class Generate extends Generator{


    public void setPossible(Object... args){

    }

    public int getRandomDSix(){
        return dSix(1);
    }

    public int getXDSix(int num){
        return dSix(num);
    }

    public Object getItem(){
        int num = 2;
        return num;
    }
}
