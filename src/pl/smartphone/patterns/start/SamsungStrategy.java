package pl.smartphone.patterns.start;

import pl.smartphone.patterns.Producer;
import pl.smartphone.patterns.Smartphone;

public class SamsungStrategy implements SmartphoneStrategy {
    @Override
    public void start() {
        // call with Android
        System.out.println("Samsung started!");
    }

    @Override
    public boolean supports(Smartphone smartphone) {
        return smartphone.getProducer() == Producer.SAMSUNG;
    }
}
