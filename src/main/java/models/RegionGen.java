package models;

/**
 * Created by Guest on 1/26/18.
 */
public class RegionGen extends Generator{

    private int random;

    public RegionGen(){
        random = dSix();
    }

    public int getRandom(){
        return random;
    }

}
