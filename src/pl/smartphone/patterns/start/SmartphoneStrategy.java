package pl.smartphone.patterns.start;

import pl.smartphone.patterns.Smartphone;

public interface SmartphoneStrategy {
    public void start();
    public boolean supports(Smartphone smartphone);
}
