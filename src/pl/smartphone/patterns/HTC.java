package pl.smartphone.patterns;

import pl.smartphone.patterns.phoneComponents.Processor;
import pl.smartphone.patterns.phoneComponents.Screen;
import pl.smartphone.patterns.system.Androidable;

public class HTC extends Smartphone implements Androidable {

    private Sim simType;
    private AndroidVersion androidVersion;

    private HTC(Builder builder){
        super(builder);
        this.simType = builder.simType;
        this.androidVersion = builder.androidVersion;
    }
    public Sim getSimType() {
        return simType;
    }

    public AndroidVersion getAndroidVersion() {
        return androidVersion;
    }

    public static class Builder extends Smartphone.Builder<Builder>{

        public Builder(Processor processor, Screen screen){
            super(processor, screen);
        }

        private Sim simType;
        private AndroidVersion androidVersion;

        public Builder withSimType(Sim simType){
            this.simType = simType;
            return this;
        }

        public Builder withAndroidVersion(AndroidVersion androidVersion){
            this.androidVersion = androidVersion;
            return this;
        }

        public HTC build(){
            return new HTC(this);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "HTC{" +
                "simType=" + simType +
                ", androidVersion=" + androidVersion +
                '}';
    }
}
