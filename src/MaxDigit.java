/**
 * Algorithm #3 of Week 02 homework.
 *
 * Display the max digit from a number.
 *
 * Creation date: Aug 1, 2020
 * @author cezar
 *
 */

public class MaxDigit {
    public static short getMaxDigit(int n) {
        short max = 0;
        short aux = 0;

        if ( n < 0) {
            n = n * (-1);
        }
        while ( n != 0 ) {
            aux = (short) (n % 10);
            if ( max < aux) {
                max = aux;
            }
            n = n / 10 ;
        }
        return max;
    }
}
