/**
 * Algorithm #1 of Week 02 homework.
 *
 * Calculate the sum of the first 100 numbers higher than 0
 *
 * Creation date: Aug 1, 2020
 * @author cezar
 *
 */

public class Sum {

    public static void CalculateSum() {
        int sum = 0;
        short i;

        for ( i=1; i<=100; i++) {
            sum = sum + i;
        }
        System.out.printf("The sum of the first 100 numbers is: %d%n", sum);
    }
}
