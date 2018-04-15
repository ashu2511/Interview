package com.ubs.opsit.interviews;
import static com.ubs.opsit.interviews.AppConts.*;

public class Minute implements TimeConverter {

    @Override
    public String convertTime(String minutes) {

        int minsDivByFive = Integer.valueOf(minutes) / 5;
        int minsModFive = Integer.valueOf(minutes) % 5;

        return getLampsMultiplesOfFiveAndSingleMins(minsDivByFive, minsModFive) ;
    }

    private String getLampsMultiplesOfFiveAndSingleMins(int minsDividedBy5, int minsModulus5) {

        StringBuilder lamps = new StringBuilder(ALL_ELEVEN_LIGHTS_OFF);
        StringBuilder lampsFour = new StringBuilder(ALL_FOUR_LIGHTS_OFF);

        for (int i = 0; i < minsDividedBy5; i++) {
        	int value = i+1;
            if (0 == value % 3) {
                lamps.replace(i, value, RED_LIGHT);
            } else {
                lamps.replace(i, value, YELLOW_LIGHT);
            }
        }
        
        for (int i = 0; i < minsModulus5; i++) {
        	lampsFour.replace(i, i + 1, YELLOW_LIGHT);
        }
         
        return lamps.toString() + "\n" + lampsFour.toString();
    }

}
