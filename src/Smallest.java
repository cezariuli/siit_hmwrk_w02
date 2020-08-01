/**
 * Algorithm #2 from Week 02 homework.
 *
 * Display the smallest number from an array of numbers
 *
 * Creation date: Aug 1, 2020
 * @author cezar
 *
 */

public class Smallest {
    public static int getSmallestNumber(int[] array){

        int min = 0;

        for(int x : array) {
            if ( min > x) {
                min =x;
            }
        }

        return min;
    }
}
