package goit.homeworks;

public class Circle extends Shape implements Scalable {

    static final double PI = Math.PI;

    private float radius;

    public Circle(int bordersWidth, int centerX, int centerY, float radius) {
        super("Circle", bordersWidth, centerX, centerY);
        this.radius = radius;
    }

    public Circle(int bordersWidth, String fillColor, int centerX, int centerY, float radius) {
        super("Circle", bordersWidth, fillColor, centerX, centerY);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    protected float calcSquare() {
        return (float) (PI * radius * radius);
    }

    @Override
    public void scale(float value) {
        this.radius = (float) (radius * Math.sqrt(value));
    }
}
