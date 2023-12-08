package goit.homeworks;

public class Line extends Shape {

    private float length;

    private float directionDegree;

    public Line(int bordersWidth, int centerX, int centerY, float length, float directionDegree) {
        super("Line", bordersWidth, centerX, centerY);
        this.length = length;
        this.directionDegree = directionDegree;
    }

    public Line(int bordersWidth, String fillColor, int centerX, int centerY, float length, float directionDegree) {
        super("Line", bordersWidth, fillColor, centerX, centerY);
        this.length = length;
        this.directionDegree = directionDegree;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getDirectionDegree() {
        return directionDegree;
    }

    public void setDirectionDegree(float directionDegree) {
        this.directionDegree = directionDegree;
    }

    @Override
    protected float calcSquare() {
        System.out.println("Line has no square");
        return 0;
    }

    @Override
    public String getShapeParameters() {
        return name + " with: direction degrees=" + directionDegree +
                ", length=" + length +
                ", bordersWidth=" + bordersWidth +
                ", isFilled=" + isFilled +
                ", fillColor=" + fillColor + "\n";
    }
}
