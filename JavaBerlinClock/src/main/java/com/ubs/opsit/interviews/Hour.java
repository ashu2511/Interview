package com.ubs.opsit.interviews;
import static com.ubs.opsit.interviews.AppConts.*;

public class Hour implements TimeConverter {

    @Override
    public String convertTime(String hrs) {

        return getLampsMultiplesOfFiveAndSingleHrs(hrs);
    }

    public String getLampsMultiplesOfFiveAndSingleHrs(String hours) {

        StringBuilder lamps_1 = new StringBuilder(ALL_LIGHTS_OFF);
        StringBuilder lamps_2 = new StringBuilder(ALL_LIGHTS_OFF);

        for (int i = 0; i < (Integer.valueOf(hours) / MULTIPLE_OF_FIVE); i++) {
        	lamps_1.replace(i, i + 1, RED_LIGHT);
        }

        for (int i = 0; i < (Integer.valueOf(hours) % MULTIPLE_OF_FIVE); i++) {  
        	lamps_2.replace(i, i + 1, RED_LIGHT);
        }
        return lamps_1.toString() + "\n" + lamps_2.toString();
    }

}
