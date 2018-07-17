package pl.smartphone.patterns;

import pl.smartphone.patterns.phoneComponents.Camera;
import pl.smartphone.patterns.phoneComponents.Cover;
import pl.smartphone.patterns.phoneComponents.Processor;
import pl.smartphone.patterns.phoneComponents.Screen;

public class Main {

    public static void main(String[] args) {

        Smartphone iphone = new Smartphone.Builder(new Processor("A 11"), new Screen(2436, 1125))
                .withModel("iPhone X")
                .withCover(new Cover("metal"))
                .withCamera(new Camera(12))
                .build();

        Smartphone samsung = new Smartphone.Builder(new Processor("Qualcomm Snapdragon"), new Screen(1440, 2560))
                    .withModel("Samsung Galaxy S7")
                    .withCover(new Cover("plastic"))
                    .withCamera(new Camera(12))
                    .build();

        System.out.println(iphone);
        System.out.println(samsung);
    }
}
