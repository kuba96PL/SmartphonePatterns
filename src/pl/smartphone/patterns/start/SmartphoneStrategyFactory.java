package pl.smartphone.patterns.start;
import pl.smartphone.patterns.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneStrategyFactory {

    private final List<SmartphoneStrategy> strategyList;

    public SmartphoneStrategyFactory(List<SmartphoneStrategy> listOfStrategies){
        strategyList = new ArrayList<>(listOfStrategies);
    }

    public SmartphoneStrategy getStrategy(Smartphone smartphone) throws NoStrategyFoundException{

        for(SmartphoneStrategy strategy : strategyList){
            if (strategy.supports(smartphone)){
                return strategy;
            }
        }
        throw new NoStrategyFoundException();
    }
}
