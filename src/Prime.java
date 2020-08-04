/**
 * Algorithm #5 of Week 02 homework.
 *
 * Display all the prime numbers lower than a given number
 *
 * Creation date: Aug 2, 2020
 * @author cezar
 *
 */
import java.lang.Math;

public class Prime {
    public static void showPrimeNumbers (int n) {

        int i = 0;
        int j = 0;

        if ( n < 2 ) {
            System.out.println("Only natural numbers greater than 1 can be prime");
        }
        else {
            System.out.println("The prime numbers until " + n + " are: \n");
            for ( i = 2; i < n; i++){
                if (Prime.isPrimeNumber(i)) {
                    System.out.println(i);
                }
            }
        }
    }

    public static boolean isPrimeNumber (int m) {
        int i = 0;
        boolean isPrime = true;

        for (i = 2; i <= Math.sqrt(m); i++ ) {
            if ( m % i == 0 ) {
                isPrime = false;
            }
        }
        return isPrime;
    }
}
