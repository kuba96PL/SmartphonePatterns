package pl.smartphone.patterns.start;

import pl.smartphone.patterns.Smartphone;

public interface SmartphoneStrategy {
    void start();
    boolean supports(Smartphone smartphone);
}
