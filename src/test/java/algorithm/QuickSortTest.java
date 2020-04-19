package algorithm;

import interfaces.algorithm.IGreedy;
import interfaces.algorithm.ISort;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class QuickSortTest {

    private static ISort algorithm;

    @BeforeClass
    public static void beforeAll() {
        algorithm = new QuickSort();
    }

    @Test
    public void testSort_InputIsValidList_ReturnsSortedList() {
        var input = Arrays.asList(6, 5, 4, 3, 2, 1);

        var output = algorithm.sort(input);

        input.sort(Comparator.naturalOrder());
        assertThat(input, is(output));
    }
}
