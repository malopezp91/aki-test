package aki;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static int findPairs( int[] array, int k) {
        int numberOfPairs = 0;

        int[] helperArray = new int[k];

        for(int value : array) {
            int mod = value % k;
            helperArray[mod]  = ++helperArray[mod];
        }

        for (int i = 0; i < k; i++) {
            if (i == 0) {
                numberOfPairs += getCombinations(helperArray[i]);
            }
            else {
                int secondIndex = k - i;
                if (secondIndex  == i) {
                    numberOfPairs += getCombinations(helperArray[i]);
                    break;
                } else if (secondIndex < i) {
                    break;
                } else {
                    numberOfPairs += helperArray[i] * helperArray[secondIndex];
                }
            }

        }

        return numberOfPairs;
    }

    private static int getCombinations(int frequency) {
        return ((frequency) * (frequency - 1)) / 2;
    }
}
