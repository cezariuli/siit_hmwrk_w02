/**
 * Algorithm #4 of Week 02 homework.
 *
 * Check if a number is palindrom( e.g palindrom 1221, 34143)
 *
 * Creation date: Aug 2, 2020
 * @author cezar
 *
 */

public class Palindrom {
    public static boolean isNumberPalindrom (int n) {
        /**
         * This method is receiving the number to be processed if it is palindromic as an argument.
         * "reversed" variable is used to keep the value of the input after it is reversed;
         * "aux" is used as a temporary variable, that is receiving the value of n in order to help reversing it
         */
        int reversed = 0;
        boolean isPalindrom = false;

        if ( n < 0 ) {
            return isPalindrom;
        }

        int aux = n;

        while ( aux != 0 ) {
            reversed = (reversed * 10 ) + (aux % 10);
            aux = aux / 10;
        }

        if ( n == reversed) {
            isPalindrom = true;
        }

        return isPalindrom;
    }
}
