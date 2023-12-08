package goit.homeworks;

public class Square extends Shape implements Scalable {

    private float side;

    public Square(int bordersWidth, int centerX, int centerY, float side) {
        super("Square", bordersWidth, centerX, centerY);
        this.side = side;
    }

    public Square(int bordersWidth, String fillColor, int centerX, int centerY, float side) {
        super("Square", bordersWidth, fillColor, centerX, centerY);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }

    @Override
    protected float calcSquare() {
        return side * side;
    }

    @Override
    public void scale(float value) {
        this.side = side * value;
    }
}
