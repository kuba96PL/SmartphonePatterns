package pl.smartphone.patterns;

import pl.smartphone.patterns.phoneComponents.Camera;
import pl.smartphone.patterns.phoneComponents.Cover;
import pl.smartphone.patterns.phoneComponents.Processor;
import pl.smartphone.patterns.phoneComponents.Screen;

public class Smartphone {
    private String model;
    private Processor processor;
    private Cover cover;
    private Screen screen;
    private Camera camera;

    private Smartphone(){
    }

    public String getModel() {
        return model;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Cover getCover() {
        return cover;
    }

    public Screen getScreen() {
        return screen;
    }

    public Camera getCamera() {
        return camera;
    }

    public static class Builder{
        private String model;
        private Processor processor;
        private Cover cover;
        private Screen screen;
        private Camera camera;

        public Builder(Processor processor, Screen screen){
            this.processor = processor;
            this.screen = screen;
        }

        public Builder withModel(String model){
            this.model = model;
            return this;
        }

        public Builder withCover(Cover cover){
            this.cover = cover;
            return this;
        }

        public Builder withCamera(Camera camera){
            this.camera = camera;
            return this;
        }

        public Smartphone build(){
            Smartphone phone = new Smartphone();
            phone.camera = this.camera;
            phone.cover = this.cover;
            phone.model = this.model;
            phone.processor = this.processor;
            phone.screen = this.screen;
            return phone;
        }
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "model='" + model + '\'' +
                ", processor=" + processor +
                ", cover=" + cover +
                ", screen=" + screen +
                ", camera=" + camera +
                '}';
    }
}
