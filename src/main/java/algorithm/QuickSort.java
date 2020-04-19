package algorithm;

import interfaces.algorithm.ISort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuickSort implements ISort {
    @Override
    public List<Integer> sort(List<Integer> elements) {
        if (elements.size() <= 1) {
            return elements;
        }

        var random = new Random();
        var count = elements.size();
        var pivotPosition = random.nextInt(count);
        var smaller = new ArrayList<Integer>(count / 2);
        var larger = new ArrayList<Integer>(count / 2);

        for (var i = 0; i < count; i++) {
            if (i == pivotPosition) {
                continue;
            }
            if (elements.get(i) < elements.get(pivotPosition)) {
                smaller.add(elements.get(i));
            }
            else {
                larger.add(elements.get(i));
            }
        }

        var merged = sort(smaller);
        merged.add(elements.get(pivotPosition));
        merged.addAll(sort(larger));

        return merged;
    }
}
