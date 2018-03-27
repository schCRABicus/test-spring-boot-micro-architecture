package com.gmail.schcrabicus.calculation.algorithms;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Fibonacci calculator class.
 * @author <a href="mailto:mikalai.lushchytski@altoros.com">Mikalai Lushchytski</a>
 */
public final class Fibonacci {

    private Fibonacci() {}

    public enum Algorithm {

        NAIVE("naive") {
            @Override
            public Long calculate(int value) {
                return Fibonacci.naive(value);
            }
        };

        private final String name;

        Algorithm(String name) {
            this.name = name;
        }

        public abstract Long calculate(int value);

        @JsonCreator
        public Algorithm fromName(String name) {
            return Stream.of(Algorithm.values())
                    .filter(alg -> name.equals(alg.name) || name.equals(alg.name()))
                    .findFirst()
                    .orElse(null);
        }
    }

    /**
     * Naive calculation without caching, etc.
     * @param n Target number to calculate Fibonacci number for.
     * @return calculated value
     */
    public static long naive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be 0 or any positive number");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        return Fibonacci.naive(n - 1) + Fibonacci.naive( n - 2);
    }
}
