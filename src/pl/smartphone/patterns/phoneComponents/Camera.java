package pl.smartphone.patterns.phoneComponents;

public class Camera {

    private int resolution;

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public Camera(int resolution) {
        this.resolution = resolution;
    }
    private String string;

    @Override
    public String toString() {
        return "Camera{" +
                "resolution=" + resolution +
                '}';
    }
}
