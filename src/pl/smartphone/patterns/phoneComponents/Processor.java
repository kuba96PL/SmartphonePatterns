package pl.smartphone.patterns.phoneComponents;

public class Processor {

    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Processor(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "model='" + model + '\'' +
                '}';
    }
}
