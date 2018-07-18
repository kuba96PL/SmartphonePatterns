package pl.smartphone.patterns;

import pl.smartphone.patterns.phoneComponents.Processor;
import pl.smartphone.patterns.phoneComponents.Screen;
import pl.smartphone.patterns.system.IoSAble;

public class Iphone extends Smartphone implements IoSAble {

    private boolean applePay;
    private Sim simType;

    protected Iphone(Builder builder) {
        super(builder);
        this.applePay = builder.applePay;
        this.simType = builder.simType;
    }

    public boolean isApplePay() {
        return applePay;
    }

    public Sim getSimType() {
        return simType;
    }

    public static class Builder extends Smartphone.Builder<Builder>{

        public Builder(Processor processor, Screen screen){
            super(processor, screen);
        }

        private boolean applePay;
        private Sim simType;

        public Builder withApplePay(boolean applePay){
            this.applePay = applePay;
            return this;
        }

        public Builder withSimType(Sim simType){
            this.simType = simType;
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
                '}';
    }
}
