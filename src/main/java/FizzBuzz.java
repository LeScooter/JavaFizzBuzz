import java.util.ArrayList;

public class FizzBuzz {

    /**
     * List of FB tests to make
     */
    public static final ArrayList<FizzBuzzTest> FIZZ_BUZZ_TESTS = new ArrayList<>();

    static {
        //Add necessary FB tests to the FB test list
        FIZZ_BUZZ_TESTS.add(new FizzBuzzTest(3, "Fizz"));
        FIZZ_BUZZ_TESTS.add(new FizzBuzzTest(5, "Buzz"));
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

            //Iterate through each comparable
            for (FizzBuzzTest fbTest : FIZZ_BUZZ_TESTS) {
                output.append(fbTest.process(i));
            }

            //Output number if String value is empty
            System.out.println((output.length() > 0) ? output.toString() : i);
        }
    }

    public static class FizzBuzzTest {

        /**
         * Number to check multiple of
         */
        private final int multipleNumber;
        /**
         * String value to append
         */
        private final String string;

        /**
         * Default Constructor for a Fizz Buzz Test
         *
         * @param multipleNumber - Given number to compare
         * @param string         - Given {@link String} value to append
         */
        public FizzBuzzTest(final int multipleNumber, final String string) {
            this.multipleNumber = multipleNumber;
            this.string = string;
        }

        /**
         * Checks if given value is a multiple of this affiliated value,
         * returning a String value depending on the outcome
         *
         * @param value - Given value to check for multiplication
         * @return - Returns the String value if proper condition is met
         */
        public String process(final int value) {
            //Return String if it's a multiple of, else, return empty
            return (value % this.multipleNumber == 0 ? this.string : "");
        }
    }
}
