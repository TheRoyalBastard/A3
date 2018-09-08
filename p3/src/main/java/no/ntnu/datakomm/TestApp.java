package no.ntnu.datakomm;

/**
 * This is a test app used for exercise A3. Read the document with instructions.
 * The methods should be developed in steps. After each step you should run unit
 * tests and make sure that the tests pass for all the steps which you have
 * implemented so far.
 */
public class TestApp {

    /**
     * This method adds together two integers.
     *
     * @param a
     * @param b
     * @return Sum a+b
     */
    public static int add(int a, int b) {
        // TODO in Step 1: implement this method
        return -1;
    }

    /**
     * This is a non-negative subtraction: the returned result is never
     * negative.
     *
     * @param a
     * @param b
     * @return a-b, if a-b > 0, zero otherwise
     */
    public static int subtractNonNeg(int a, int b) {
        // TODO in Step 2: implement this method
        return 0;
    }

    /**
     * This is integer division. Hint: it should never generate an exception! ;)
     *
     * @param a
     * @param b
     * @return a/b rounded down to closest integer; or 0 if division is not
     * possible
     */
    public static int divide(int a, int b) {
        // TODO in Step 3: implement this method
        return 0;
    }

    public static void main(String[] args) {
        // This is a simple code that don't do much
        int a = 5;
        int b = 27;
        int c = 0;
        System.out.println("a + b = " + add(a, b));
        System.out.println("a - b = " + subtractNonNeg(a, b));
        System.out.println("b / a = " + divide(b, a));
    }
}
