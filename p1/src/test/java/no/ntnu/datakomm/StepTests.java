package no.ntnu.datakomm;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for each step of the project
 */
public class StepTests {

    @Test
    public void testStep1() {
        assertEquals(0, TestApp.add(0, 0));
        assertEquals(7, TestApp.add(2, 5));
        assertEquals(-2, TestApp.add(-6, 4));
        assertEquals(5, TestApp.add(6, -1));
    }

    @Test
    public void testStep2() {
        assertEquals(0, TestApp.subtractNonNeg(0, 0));
        assertEquals(13, TestApp.subtractNonNeg(15, 2));
        assertEquals(0, TestApp.subtractNonNeg(17, 17));
        assertEquals(0, TestApp.subtractNonNeg(17, 18));
        assertEquals(35, TestApp.subtractNonNeg(17, -18));
    }

    @Test
    public void testStep3() {
        assertEquals(4, TestApp.divide(12, 3));
        assertEquals(6, TestApp.divide(50, 8));
        assertEquals(0, TestApp.divide(3, 12));
        assertEquals(0, TestApp.divide(0, 3));
        assertEquals(0, TestApp.divide(6, 0));
        assertEquals(0, TestApp.divide(0, 0));
    }

}
