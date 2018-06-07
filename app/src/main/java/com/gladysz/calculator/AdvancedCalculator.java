package com.gladysz.calculator;

public class AdvancedCalculator {
    long calculateFibonacci(int n) {
        if (n < 2) return n;

        int fib = 1;
        int last = 1;

        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib += last;
            last = temp;
        }
        return fib;
    }

    public double calculateFactorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * calculateFactorial(n - 1));
    }
}
