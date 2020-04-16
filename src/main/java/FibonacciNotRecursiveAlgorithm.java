import interfaces.IFibonacciAlgorithm;

public class FibonacciNotRecursiveAlgorithm implements IFibonacciAlgorithm {
    @Override
    public int fibonacci(int n) {
        var prev = 1;
        var next = 1;

        for(var i = 0; i < n; i++) {
            var oldNext = next;
            next = prev + next;
            prev = oldNext;
        }

        return prev;
    }
}
