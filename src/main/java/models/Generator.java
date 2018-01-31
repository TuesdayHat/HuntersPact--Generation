package models;

import java.util.*;

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
    public void setPossible(String... args){
        this.possible = Arrays.asList(args);
    }
    public List<String> getPossible(){
        return possible;
    }

    public String randPick (List<String> poss){
        String result = null;
        int dice = 1;
        while (dice*6 < poss.size()+dice){
            dice++;
        }
        while(result == null){
            result = poss.get(dSix(dice) - (dice + 1));
        }
        return result;
    }

    public String[] buildArrBell(){
        int step = 1; //how many dice
        int stepVal = 6; //how many possible results come from those dice; e.g. 3d6 -> 3~18 = 16
        final int poss = possible.size();


        //creates an array that can hold all the possible results
        while(stepVal < poss){
//            System.out.println(stepVal + " -- " + poss);
            step++;
            stepVal = (step*5)+1;
        }
//        System.out.println(stepVal + " -- " + poss);
        String[] result = new String[stepVal];

        //generates Populations
        int popTotal = 0;
        Map<String, Integer> population = new HashMap<>();
        while(popTotal <= result.length){
            String pop = randPick(possible);
            int members = 0;
            int roll = 6;

            while(roll > 2){
                members++;
                roll = dSix(1);
            }
            popTotal += members;
            population.put(pop, members);
        }
        return result;
    }

}
