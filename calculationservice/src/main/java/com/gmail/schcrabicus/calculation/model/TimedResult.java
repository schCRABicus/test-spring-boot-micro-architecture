package com.gmail.schcrabicus.calculation.model;

/**
 * Calculation result with time elapsed included.
 * @author <a href="mailto:mikalai.lushchytski@altoros.com">Mikalai Lushchytski</a>
 * @param <T> calculation result type.
 */
public class TimedResult<T> {

    private final long ms;
    private final T result;

    public TimedResult(long ms, T result) {
        this.ms = ms;
        this.result = result;
    }

    public long getMs() {
        return ms;
    }

    public T getResult() {
        return result;
    }
}
