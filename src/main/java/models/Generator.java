package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Generator {

    public int dSix (int rolls){
        Random rand = new Random();
        int result = 0;
        for (int i=0; i< rolls; i++){
            result += rand.nextInt(6)+1;
        }
        return result;
    }

    List<String> possible = new ArrayList<String>();

    public String randPick (List<String> poss){
        String result = null;
        int rolls = 1;
        while (rolls*6 < poss.size()+rolls){
            rolls++;
        }
        while(result == null){
            result = poss.get(dSix(rolls));
        }
        return result;
    }

}
