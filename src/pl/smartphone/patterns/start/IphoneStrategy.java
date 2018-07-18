package pl.smartphone.patterns.start;

import pl.smartphone.patterns.Producer;
import pl.smartphone.patterns.Smartphone;

public class IphoneStrategy implements SmartphoneStrategy {
    @Override
    public void start() {
        // call with iPhone
        System.out.println("iOS ready to work!");
    }

    @Override
    public boolean supports(Smartphone smartphone) {
        return smartphone.getProducer() == Producer.APPLE;
    }
}
