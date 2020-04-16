import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AlgorithmTest {

    private static Algorithm algorithm;

    @BeforeClass
    public static void beforeAll() {
        algorithm = new Algorithm();
    }

    @Test
    public void testFaculty_InputIsOne_ReturnsOne() {
        var input = 1;

        var output = algorithm.faculty(input);

        assertEquals(output, input);
    }

    @Test
    public void testFaculty_InputIsThree_ReturnsSix() {
        var input = 3;

        var output = algorithm.faculty(input);

        assertEquals(output, 6);
    }
}
