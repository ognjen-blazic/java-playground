package algorithm;

import interfaces.algorithm.IGreedy;
import org.apache.commons.lang3.tuple.ImmutablePair;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Greedy implements IGreedy {
    @Override
    public ImmutablePair<List<Integer>, List<Integer>> divideIntoTwoGroups(List<Integer> elements) {
        elements.sort(Comparator.reverseOrder());

        var firstGroup = IntStream.range(0, elements.size())
                .filter(n -> n % 2 == 0)
                .mapToObj(elements::get)
                .collect(Collectors.toList());
        var secondGroup = IntStream.range(0, elements.size())
                .filter(n -> n % 2 == 1)
                .mapToObj(elements::get)
                .collect(Collectors.toList());

        return new ImmutablePair<>(firstGroup, secondGroup);
    }
}
