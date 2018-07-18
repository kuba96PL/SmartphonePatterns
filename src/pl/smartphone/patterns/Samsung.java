package pl.smartphone.patterns;

import pl.smartphone.patterns.phoneComponents.Processor;
import pl.smartphone.patterns.phoneComponents.Screen;
import pl.smartphone.patterns.system.Androidable;

public class Samsung extends Smartphone implements Androidable {

    private Sim simType;
    private Producer producer;
    private boolean NFC;
    private AndroidVersion androidVersion;

    protected Samsung(Builder builder){
        super(builder);
        this.simType = builder.simType;
        this.NFC = builder.NFC;
        this.androidVersion = builder.androidVersion;
    }

    public Sim getSimType() {
        return simType;
    }

    public boolean isNFC() {
        return NFC;
    }

    public AndroidVersion getAndroidVersion() {
        return androidVersion;
    }

    public static class Builder extends Smartphone.Builder<Builder>{

        public Builder(Processor processor, Screen screen){
            super(processor, screen);
        }

        private Sim simType;
        private boolean NFC;
        private AndroidVersion androidVersion;

        public Builder withSimType(Sim simType){
            this.simType = simType;
            return this;
        }

        public Builder hasNFC(boolean NFC){
            this.NFC = NFC;
            return this;
        }

        public Builder withAndroidVersion(AndroidVersion version){
            this.androidVersion = version;
            return this;
        }

        public Samsung build(){
            return new Samsung(this);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Samsung{" +
                "simType=" + simType +
                ", producer=" + producer +
                ", NFC=" + NFC +
                ", androidVersion=" + androidVersion +
                '}';
    }
}
