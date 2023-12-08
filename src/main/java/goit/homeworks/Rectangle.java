package goit.homeworks;

public class Rectangle extends Shape implements Scalable {

    private float sideV;

    private float sideH;

    public Rectangle(int bordersWidth, int centerX, int centerY, float sideV, float sideH) {
        super("Rectangle", bordersWidth, centerX, centerY);
        this.sideV = sideV;
        this.sideH = sideH;
    }

    public Rectangle(int bordersWidth, String fillColor, int centerX, int centerY, float sideV, float sideH) {
        super("Rectangle", bordersWidth, fillColor, centerX, centerY);
        this.sideV = sideV;
        this.sideH = sideH;
    }

    public float getSideV() {
        return sideV;
    }

    public void setSideV(float sideV) {
        this.sideV = sideV;
    }

    public float getSideH() {
        return sideH;
    }

    public void setSideH(float sideH) {
        this.sideH = sideH;
    }

    @Override
    protected float calcSquare() {
        return sideH * sideV;
    }

    @Override
    public void scale(float value) {
        this.sideV = sideV * value;
        this.sideH = sideH * value;
    }
}
