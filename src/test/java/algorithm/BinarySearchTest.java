package algorithm;

import algorithm.BinarySearch;
import interfaces.algorithm.ISearch;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {
    private static ISearch algorithm;

    @BeforeClass
    public static void beforeAll() {
        algorithm = new BinarySearch();
    }

    @Test
    public void testSearch_InputExists_ReturnsValidIndex() {
        var input = Arrays.asList(1, 2, 3, 4, 5, 6);
        var searchValue = 3;

        var output = algorithm.search(input, searchValue);

        assertEquals(input.indexOf(searchValue), output);
    }

    @Test
    public void testSearch_InputDoesNotExist_ReturnsInvalidIndex() {
        var input = Arrays.asList(1, 2, 3, 4, 5, 6);
        var searchValue = 0;

        var output = algorithm.search(input, searchValue);

        assertEquals(-1, output);
    }

    @Test
    public void testSearch_InputIsEmpty_ReturnsInvalidIndex() {
        var input = new ArrayList<Integer>();
        var searchValue = 10;

        var output = algorithm.search(input, searchValue);

        assertEquals(-1, output);
    }

}
