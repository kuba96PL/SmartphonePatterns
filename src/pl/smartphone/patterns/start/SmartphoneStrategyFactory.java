package pl.smartphone.patterns.start;

import pl.smartphone.patterns.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneStrategyFactory {

    private final List<SmartphoneStrategy> strategyList;

    public SmartphoneStrategyFactory(List<SmartphoneStrategy> listOfStrategies) {
        strategyList = listOfStrategies;
    }

    public SmartphoneStrategy getStrategy(Smartphone smartphone) throws NoStrategyFoundException {
        return strategyList.stream()
                .filter(strategy -> strategy.supports(smartphone))
                .findAny()
                .orElseThrow(NoStrategyFoundException::new);
    }
}
