package intro;

import java.lang.Math;
import java.util.ArrayList;

public class PrimeFactors {
    
    public static ArrayList<Integer> generate(int n) {
        n = Math.abs(n);

        if (n < 2) {
            return new ArrayList<Integer>();
        }

        int maxPossibleFactor = (int) Math.ceil(Math.sqrt(n));
        int currFactor = 2;
        ArrayList<Integer> factors = new ArrayList<Integer>();
        while (n > 1 && currFactor <= maxPossibleFactor) {
            if (n % currFactor == 0) {
                factors.add(currFactor);
                n = n / currFactor;
            } else {
                currFactor++;
            }
        }

        return factors;
    }
}