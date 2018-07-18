package pl.smartphone.patterns;

import pl.smartphone.patterns.call.*;
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
                .withModel("ONE")
                .withCamera(new Camera(20))
                .withSimType(Sim.MICROSIM)
                .withCover(new Cover("stone"))
                .withAndroidVersion(AndroidVersion.LOLLIPOP)
                .build();

         List<Smartphone> listOfPhones = Arrays.asList(samsung, iphone, htc, sony);

         List<SmartphoneStrategy> list = new ArrayList<>();
        list.add(new SamsungStrategy());
        list.add(new HTCStrategy());
        list.add(new IphoneStrategy());

         SmartphoneStrategyFactory factory = new SmartphoneStrategyFactory(list);

         for (Smartphone phone : listOfPhones){
             System.out.println("\nPhone: " + phone.getModel());
             factory.getStrategy(phone).start();
         }
        }
    }

