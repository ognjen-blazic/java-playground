package algorithm;

import interfaces.algorithm.IFibonacci;

public class FibonacciRecursive implements IFibonacci {
    @Override
    public int fibonacci(int n) {
        if (n <= 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
