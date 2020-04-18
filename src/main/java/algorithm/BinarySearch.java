package algorithm;

import interfaces.algorithm.ISearch;

import java.util.List;

public class BinarySearch implements ISearch {
    @Override
    public int search(List<Integer> collection, int searchValue) {
        return binarySearch(collection, searchValue, 0, collection.size() - 1);
    }

    private int binarySearch(List<Integer> collection, int searchValue, int start, int end) {
        var middle = (start + end) / 2;

        if(collection.size() > 0 && collection.get(middle) == searchValue) {
            return middle;
        }

        if(start >= end) {
            return -1;
        }

        if (collection.get(middle) > searchValue) {
            return binarySearch(collection, searchValue, start, middle - 1);
        }

        return binarySearch(collection, searchValue, middle + 1, end);
    }
}
