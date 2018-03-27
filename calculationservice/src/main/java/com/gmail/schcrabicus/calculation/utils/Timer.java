package com.gmail.schcrabicus.calculation.utils;

import com.gmail.schcrabicus.calculation.model.TimedResult;
import org.springframework.util.StopWatch;

import java.util.function.Supplier;

/**
 * Utility timer class, measuring operations invocation time.
 * @author <a href="mailto:mikalai.lushchytski@altoros.com">Mikalai Lushchytski</a>
 */
public final class Timer {

    public static <R> TimedResult<R> trackTime(Supplier<R> operation) {
        final StopWatch watch = new StopWatch();
        watch.start();
        final R result = operation.get();
        watch.stop();

        return new TimedResult<>(watch.getLastTaskTimeMillis(), result);
    }
}
