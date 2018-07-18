package pl.smartphone.patterns;

import pl.smartphone.patterns.phoneComponents.Processor;
import pl.smartphone.patterns.phoneComponents.Screen;

public class Iphone extends Smartphone{

    private boolean applePay;
    private Sim simType;
    private Producer producer;

    protected Iphone(Builder builder) {
        super(builder);
        this.applePay = builder.applePay;
        this.simType = builder.simType;
        this.producer = builder.producer;
    }

    public boolean isApplePay() {
        return applePay;
    }

    public Sim getSimType() {
        return simType;
    }

    public Producer getProducer() {
        return producer;
    }

    public static class Builder extends Smartphone.Builder<Builder>{

        public Builder(Processor processor, Screen screen){
            super(processor, screen);
        }

        private boolean applePay;
        private Sim simType;
        private Producer producer;

        public Iphone.Builder withApplePay(boolean applePay){
            this.applePay = applePay;
            return this;
        }

        public Iphone.Builder withSimType(Sim simType){
            this.simType = simType;
            return this;
        }

        public Iphone.Builder producedBy(Producer producer){
            this.producer = producer;
            return this;
        }

        public Iphone build(){
            return new Iphone(this);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Iphone{" +
                "applePay=" + applePay +
                ", simType=" + simType +
                ", producer=" + producer +
                '}';
    }
}
