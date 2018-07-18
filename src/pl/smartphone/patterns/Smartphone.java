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
    private Producer producer;

    protected Smartphone(Builder<?> builder){
        this.model = builder.model;
        this.processor = builder.processor;
        this.cover = builder.cover;
        this.screen = builder.screen;
        this.camera = builder.camera;
        this.producer = builder.producer;
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

    public Producer getProducer() {
        return producer;
    }

    public static class Builder <T extends  Builder<T>>{

        private String model;
        private Processor processor;
        private Cover cover;
        private Screen screen;
        private Camera camera;
        private Producer producer;


        public Builder(Processor processor, Screen screen){
            this.processor = processor;
            this.screen = screen;
        }

        public T withModel(String model){
            this.model = model;
            return (T)this;
        }

        public T withCover(Cover cover){
            this.cover = cover;
            return (T)this;
        }

        public T withCamera(Camera camera){
            this.camera = camera;
            return (T)this;
        }

        public T producedBy(Producer producer){
            this.producer = producer;
            return (T)this;
        }

        public Smartphone build(){
            return new Smartphone(this);
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
                ", producer=" + producer +
                '}';
    }
}
