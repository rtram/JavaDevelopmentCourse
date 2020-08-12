package com.company;

public class Main {

    public static void main(String[] args) {
//         int newScore = calculateScore("Tim", 500);
//         System.out.println("New score is " + newScore);
//         calculateScore(75);
//         calculateScore();
//        calcFeetAndInchesToCentimeters(1, 11);
//        calcFeetAndInchesToCentimeters(-
//        getDurationString(126, 59);
        getDurationString(-1000);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (!(feet >= 0) || !(inches >= 0 && inches <= 12)) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
        double totalInches = (feet * 12) + inches;
        System.out.println(totalInches * 2.54);
        return totalInches * 2.54;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (!(inches >= 0)) {
            System.out.println("Invalid inches parameter");
            return -1;
        }
        System.out.println( inches * 2.54);
        return  inches * 2.54;
    }

    public static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0 || seconds > 59)) {
            System.out.println("Invalid value");
            return "Invalid value";
        }
        int hour = minutes / 60;
        int min = minutes % 60;
        System.out.println(hour + "h " + min + "m " + seconds + "s");
        return hour + "h " + min + "m " + seconds + "s";
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            System.out.println("Invalid value");
            return "Invalid value";
        }

        int minutes = seconds / 60;
        int sec = seconds % 60;
        return getDurationString(minutes, sec);
    }
}
