package pl.smartphone.patterns.phoneComponents;

public class Cover {

    private String material;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Cover(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Cover{" +
                "material='" + material + '\'' +
                '}';
    }
}
