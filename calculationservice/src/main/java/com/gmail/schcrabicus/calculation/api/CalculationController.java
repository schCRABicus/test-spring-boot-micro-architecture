package com.gmail.schcrabicus.calculation.api;

import com.gmail.schcrabicus.calculation.algorithms.Fibonacci;
import com.gmail.schcrabicus.calculation.model.TimedResult;
import com.gmail.schcrabicus.calculation.utils.Timer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Endpoint providing calculation facilities.
 * @author <a href="mailto:mikalai.lushchytski@altoros.com">Mikalai Lushchytski</a>
 */
@RestController
public class CalculationController {

    @GetMapping(value = "/fibonacci/{value}")
    public TimedResult<Long> fibonacci(
            @PathVariable("value") int value,
            @RequestParam(value = "algorithm", defaultValue = "NAIVE") Fibonacci.Algorithm algorithm
    ) {
        return Timer.trackTime(
                () -> algorithm.calculate(value)
        );
    }
}
