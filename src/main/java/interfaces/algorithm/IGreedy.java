package interfaces.algorithm;

import org.apache.commons.lang3.tuple.ImmutablePair;

import java.util.List;

public interface IGreedy extends IAlgorithm {
    ImmutablePair<List<Integer>, List<Integer>> divideIntoTwoGroups(List<Integer> elements);
}
