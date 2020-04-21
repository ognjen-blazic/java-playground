package algorithm;

import interfaces.algorithm.IFibonacci;

public class FibonacciRecursiveCached implements IFibonacci {

    private final int[] cache = new int[100];

    @Override
    public int fibonacci(int n) {
        if (n <= 1) {
            cache[n] = 1;
        }

        if(cache[n] == 0) {
            cache[n] = fibonacci(n - 1) + fibonacci(n - 2);
        }

        return cache[n];
    }
}
