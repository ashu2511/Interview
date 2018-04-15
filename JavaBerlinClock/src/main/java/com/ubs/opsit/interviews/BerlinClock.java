package com.ubs.opsit.interviews;

import java.util.Scanner;

public class BerlinClock {
	
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		try {
		System.out.println("Please enter input in form of HH:MM:SS ");
		String time = sc.next();
		 System.out.println(getTime(time));
		} catch(Exception ex) {
				ex.printStackTrace();
		} finally {
			sc.close();
		}
	}
    public static String getTime(String time) {
    	if(null == time || "".equals(time)) {
    		 throw new IllegalArgumentException("Input can not be null or Empty");
    	} else  if (!time.matches("\\d\\d:\\d\\d:\\d\\d")) {
            throw new IllegalArgumentException("Time must be in the format HH:MM:SS");
        }

        StringBuilder tempSB = new StringBuilder();
        String[] timeElements = time.split(":");
        
        if(Integer.valueOf(timeElements[0]) > 23 || Integer.valueOf(timeElements[1]) > 60 || Integer.valueOf(timeElements[2]) > 60) {
        	 throw new IllegalArgumentException("Time must be in the correct time frame");
        }
        
        tempSB.append(new Second().convertTime(timeElements[2])).append("\n");
        tempSB.append(new Minute().convertTime(timeElements[1])).append("\n");
        tempSB.append(new Hour().convertTime(timeElements[0])).append("\n");

        return tempSB.toString();
    }
}
