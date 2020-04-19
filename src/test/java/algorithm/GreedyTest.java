package algorithm;

import interfaces.algorithm.IGreedy;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GreedyTest {

    private static IGreedy algorithm;

    @BeforeClass
    public static void beforeAll() {
        algorithm = new Greedy();
    }

    @Test
    public void testGreedy_InputIsValidList_ReturnsTwoValidGroupsDivided() {
        var input = Arrays.asList(1, 2, 3, 4, 5, 6);

        var output = algorithm.divideIntoTwoGroups(input);

        assertThat(Arrays.asList(6, 4, 2), is(output.left));
        assertThat(Arrays.asList(5, 3, 1), is(output.right));
    }
}
