import interfaces.IFacultyAlgorithm;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FacultyAlgorithmTest {

    private static IFacultyAlgorithm algorithm;

    @BeforeClass
    public static void beforeAll() {
        algorithm = new FacultyAlgorithm();
    }

    @Test
    public void testFaculty_InputIsOne_ReturnsOne() {
        var input = 1;

        var output = algorithm.faculty(input);

        assertEquals(input, output);
    }

    @Test
    public void testFaculty_InputIsThree_ReturnsSix() {
        var input = 3;

        var output = algorithm.faculty(input);

        assertEquals(6, output);
    }
}
