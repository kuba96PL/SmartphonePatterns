package pl.smartphone.patterns;

import pl.smartphone.patterns.start.*;
import pl.smartphone.patterns.phoneComponents.Camera;
import pl.smartphone.patterns.phoneComponents.Cover;
import pl.smartphone.patterns.phoneComponents.Processor;
import pl.smartphone.patterns.phoneComponents.Screen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws NoStrategyFoundException {
        Smartphone samsung = new Samsung.Builder(new Processor("Qualcomm Snapdragon"), new Screen(2426, 1125))
                .producedBy(Producer.SAMSUNG)
                .withModel("S7")
                .withCamera(new Camera(12))
                .hasNFC(true)
                .withCover(new Cover("plastic and glass"))
                .withSimType(Sim.MICROSIM)
                .withAndroidVersion(AndroidVersion.OREO)
                .build();

        Smartphone iphone = new Iphone.Builder(new Processor("Intel A 11"), new Screen(2246, 1125))
                .producedBy(Producer.APPLE)
                .withModel("iPhone X")
                .withCamera(new Camera(12))
                .withSimType(Sim.NANOSIM)
                .withApplePay(true)
                .withCover(new Cover("metal and glass"))
                .build();

        Smartphone htc = new HTC.Builder(new Processor("AMD"), new Screen(1234, 5678))
                .producedBy(Producer.HTC)
                .withModel("ONE")
                .withCamera(new Camera(20))
                .withSimType(Sim.MICROSIM)
                .withCover(new Cover("stone"))
                .withAndroidVersion(AndroidVersion.LOLLIPOP)
                .build();

        Smartphone sony = new HTC.Builder(new Processor("AMD"), new Screen(1234, 5678))
                .producedBy(Producer.SONY)
                .withModel("Xperia")
                .withCamera(new Camera(20))
                .withSimType(Sim.MICROSIM)
                .withCover(new Cover("stone"))
                .withAndroidVersion(AndroidVersion.LOLLIPOP)
                .build();

        List<Smartphone> listOfPhones = Arrays.asList(samsung, iphone, htc, sony);

        List<SmartphoneStrategy> list = Arrays.asList(new SamsungStrategy(), new HTCStrategy(), new IphoneStrategy());

        SmartphoneStrategyFactory factory = new SmartphoneStrategyFactory(list);

        listOfPhones.forEach(smartphone -> {
            System.out.println("\nPhone: " + smartphone.getModel());
            try {
                factory.getStrategy(smartphone).start();
            } catch (NoStrategyFoundException e) {
                System.out.println(smartphone.getModel() + ": I don't know how to start it");
            }
        });


    }
}

