package com.dominapp.dni.hsbb;

import java.util.Random;

/**
 * Created by rck on 4/24/2015.
 */
public class Player {
    int average = 50;
    int standardDeviation = 17;
    int iq, athleticism, personality, bmi, agility, acceleration, strength, stamina, shortRange, mediumRange, longRange,
            rebound, height, weight, clutch, showmanship, aggressive, sportsmanship, hothead, passer, offensiveAwareness,
            defensiveAwareness,toughness, injury,recovery;
    boolean eligible, suspended, injured;
    Random random = new Random();

    public Player() {
        int awareness;
        double r = random.nextGaussian();
        height = (int) (70 + r * 3);
        bmi = (int) (23 + r * 4.73);
        clutch=r100();
        hothead=r100();
        iq=r100();
        sportsmanship=r100();
        showmanship=r100();
        toughness=r100();
        aggressive=r100();
        weight=(int)((bmi+height*height)/703);
        awareness=partialRandom(iq,50);
        offensiveAwareness=partialRandom(awareness,30);
        defensiveAwareness=partialRandom(awareness,30);
       //comment



    }

    private int partialRandom(int firstLevelValue, int percentage){
        double r = random.nextGaussian();
        int average=percentage/2;
        int standardDeviation=average/3;
        return (int)(r*standardDeviation+average+firstLevelValue*(100-percentage)/100);

    }
    private int r100()
    {
        double r = random.nextGaussian();
        return(int)(average+r*standardDeviation);
    }

}
