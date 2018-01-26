package models;

import java.util.Arrays;

/**
 * Created by Guest on 1/26/18.
 */
public class Generate extends Generator{
//this class exists purely to test the abstract Generator class's methods. Can safely be removed later.
    //all other classes will be inheriting from the Generator for dice rolling purposes



    public int getXDSix(int num){
        return dSix(num);
    }

    public Object getItem(){
        return randPick(this.possible);
    }
}
