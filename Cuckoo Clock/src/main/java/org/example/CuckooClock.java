package org.example;

public class CuckooClock {
    public static String cuckooClock(String inputTime, int chimes) {
        int count = 0;

        int hours = Integer.parseInt(inputTime.split(":")[0]);
        int minutes = Integer.parseInt(inputTime.split(":")[1]);

        if (minutes == 0) {
            count += hours;
        } else if (minutes == 15 || minutes == 30 || minutes == 45) {
            count++;
        }


        while (count < chimes) {
            minutes++;

            if (minutes == 60) {
                minutes = 0;
                hours++;
                if (hours == 13) {
                    hours = 1;
                }
            }

            if (minutes == 0) {
                count += hours;
            } else if (minutes == 15 || minutes == 30 || minutes == 45) {
                count++;
            }
        }
        return String.format("%02d:%02d", hours, minutes);
    }
}
