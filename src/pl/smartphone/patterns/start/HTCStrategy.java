package pl.smartphone.patterns.start;

import pl.smartphone.patterns.Producer;
import pl.smartphone.patterns.Smartphone;

public class HTCStrategy implements SmartphoneStrategy {

    @Override
    public void start() {
        System.out.println("Welcome to HTC!");
    }

    @Override
    public boolean supports(Smartphone smartphone) {
        return smartphone.getProducer() == Producer.HTC;
    }
}
