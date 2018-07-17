package pl.smartphone.patterns.phoneComponents;

public class Screen {

    private int resX;
    private int resY;

    public int getResX() {
        return resX;
    }

    public void setResX(int resX) {
        this.resX = resX;
    }

    public int getResY() {
        return resY;
    }

    public void setResY(int resY) {
        this.resY = resY;
    }

    public Screen(int resX, int resY) {
        this.resX = resX;
        this.resY = resY;
    }

    @Override
    public String toString() {
        return "Screen{" +
                "resX=" + resX +
                ", resY=" + resY +
                '}';
    }
}
