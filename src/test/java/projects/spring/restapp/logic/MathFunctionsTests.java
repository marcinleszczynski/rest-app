package projects.spring.restapp.logic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MathFunctionsTests {
    private MathFunctions mathFunctions;

    @BeforeEach
    void setUp() {
        mathFunctions = new MathFunctions();
    }

    @Test
    void testSquare() {
        assertEquals(9, mathFunctions.square(3));
        assertEquals(25, mathFunctions.square(-5));
        assertEquals(0, mathFunctions.square(0));
        assertEquals(1, mathFunctions.square(1));
    }

    @Test
    void testCube() {
        assertEquals(27, mathFunctions.cube(3));
        assertEquals(-64, mathFunctions.cube(-4));
        assertEquals(0, mathFunctions.cube(0));
        assertEquals(1, mathFunctions.cube(1));
    }

    @Test
    void testAdd() {
        assertEquals(7, mathFunctions.add(3, 4));
        assertEquals(-10, mathFunctions.add(20, -30));
        assertEquals(0, mathFunctions.add(-5, 5));
        assertEquals(4, mathFunctions.add(2, 2));
        assertTrue(mathFunctions.add(71, 58) == mathFunctions.add(58, 71));
    }

    @Test
    void testMul() {
        assertEquals(20, mathFunctions.mul(5, 4));
        assertEquals(-15, mathFunctions.mul(5, -3));
        assertEquals(25, mathFunctions.mul(5, 5));
        assertEquals(0, mathFunctions.mul(40, 0));
        assertTrue(mathFunctions.mul(45, 54) == mathFunctions.mul(54, 45));
    }
}
