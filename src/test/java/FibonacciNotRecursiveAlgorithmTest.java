import interfaces.IFibonacciAlgorithm;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciNotRecursiveAlgorithmTest {

    private static IFibonacciAlgorithm algorithm;

    @BeforeClass
    public static void beforeAll() {
        algorithm = new FibonacciNotRecursiveAlgorithm();
    }

    @Test
    public void testFibonacci_InputIsOne_ReturnsOne() {
        var input = 1;

        var output = algorithm.fibonacci(input);

        assertEquals(input, output);
    }

    @Test
    public void testFibonacci_InputIsTwo_ReturnsTwo() {
        var input = 2;

        var output = algorithm.fibonacci(input);

        assertEquals(input, output);
    }

    @Test
    public void testFibonacci_InputIsThree_ReturnsThree() {
        var input = 3;

        var output = algorithm.fibonacci(input);

        assertEquals(3, output);
    }

    @Test
    public void testFibonacci_InputIsFour_ReturnsFive() {
        var input = 4;

        var output = algorithm.fibonacci(input);

        assertEquals(5, output);
    }

    @Test
    public void testFibonacci_InputIsFive_ReturnsEight() {
        var input = 5;

        var output = algorithm.fibonacci(input);

        assertEquals(8, output);
    }
}
