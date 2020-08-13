package com.company;

public class Main {

    public static void main(String[] args) {
	    int number = 4;
	    int finishNumber = 20;
	    int evenNumbersFound = 0;

	    while(number <= finishNumber) {
	        number++;
	        if(!isEvenNumber(number)) {
	            continue;
            }
            System.out.println("Even number " + number);
	        evenNumbersFound++;
	        if (evenNumbersFound == 5) {
	            break;
            }
        }

        System.out.println("Total number of even numbers found is " + evenNumbersFound);
    }

    public static boolean isEvenNumber(int num) {
        if (num < 0) {
            return false;
        }

        return num % 2 == 0;
    }
}
