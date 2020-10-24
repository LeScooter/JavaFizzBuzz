import java.util.Map;
import java.util.TreeMap;

public class FizzBuzzMap {

    /**
     * Map of FB tests to make
     */
    public static final TreeMap<Integer, String> FIZZ_BUZZ_TESTS = new TreeMap<>();

    static {
        //Add necessary FB tests to the FB test map
        FIZZ_BUZZ_TESTS.put(3, "Fizz");
        FIZZ_BUZZ_TESTS.put(5, "Buzz");
    }

    /**
     * Main runnable class
     *
     * @param args - Given {@link String} arguments
     */
    public static void main(String[] args) {

        //Declare the initial String output
        StringBuilder output;

        //Count through 100 numbers
        for (int i = 1; i < 100; i++) {

            //Create a new String builder instance
            output = new StringBuilder();

            //Iterate through each entry in the fb test map
            for (Map.Entry<Integer, String> entry : FIZZ_BUZZ_TESTS.entrySet()) {
                output.append(i % entry.getKey() == 0 ? entry.getValue() : "");
            }

            //Output number if String value is empty
            System.out.println((output.length() > 0) ? output.toString() : i);
        }
    }
}
