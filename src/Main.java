/**
Week 02 (Intro to Java) homework of  JAVA course.

 Requirements:

 Implement in java the following algorithms:

 1. Calculate the sum of the first 100 numbers higher than 0

 2. Display the smallest number from an array of numbers

 3. Display the max digit from a number.

 4. Check if a number is palindrom( e.g palindrom 1221, 34143)

 5. Display all the prime numbers lower than a given number

Created: Aug 1, 2020
 @author cezar
*/

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        //start by asking the user which algorithm to run
        System.out.println("Welcome Filip! This is Cezar's homework. " +
                "Please select which of the below algorithms you want to review: \n" +
                "1. Calculate the sum of the first 100 numbers higher than 0\n" +
                "2. Display the smallest number from an array of number\n" +
                "3. Display the max digit from a number.\n" +
                "4. Check if a number is palindrom\n" +
                "5. Display all the prime numbers lower than a given number\n");

        //read input from user
        int option = 0;
        boolean hasExceptions = false;

        Scanner keyboard = new Scanner(System.in);

        do {
            hasExceptions = false;
            try {
                option = Integer.parseInt(keyboard.nextLine());
                if ( option < 1 || option > 5) {
                    System.out.println("You must enter a number from 1 to 5. Try again!");
                    hasExceptions = true;
                }
                //System.out.println(option);
            } catch (Exception ex) {
                System.out.println("Your input is not a number. Try again!");
                hasExceptions = true;
            }
        } while (hasExceptions);

        //declare and initialise the array to be used for algorithm #2
        int[] numbers = { 2, 73, 15, -4, 27, 0};

        //declare and initialise the number to be used for algorithm #3
        int nr = 3648;

        //declare and initialise the number to be used for algorithm #4
        int nr2 = 1221;

        switch(option) {
            case 1:
                Sum.CalculateSum();
                break;
            case 2:
                System.out.println("Minimum number in the array is: " + Smallest.getSmallestNumber(numbers));
                break;
            case 3:
                System.out.println("Maximum digit of the number " + nr + " is " + MaxDigit.getMaxDigit(nr));
                break;
            case 4:
                if (Palindrom.isNumberPalindrom(nr2) == true) {
                    System.out.println("Number " + nr2 + " is palindromic");
                }
                else {
                    System.out.println("Number " + nr2 + " is not palindromic");
                }
                break;
            case 5:
                break;
            default:
                System.out.println("Unknown option");
        }

    }
}
