package goit.homeworks;

public abstract class Shape {

    protected String name;

    protected int bordersWidth;

    protected int centerX;

    protected int centerY;

    protected boolean isFilled;

    protected String fillColor = "#00000000";

    public Shape() {}

    public Shape(String name, int bordersWidth, int centerX, int centerY) {
        this.name = name;
        this.bordersWidth = bordersWidth;
        this.centerX = centerX;
        this.centerY = centerY;
    }

    public Shape(String name, int bordersWidth, String fillColor, int centerX, int centerY) {
        this.name = name;
        this.bordersWidth = bordersWidth;
        this.fillColor = fillColor;
        this.centerX = centerX;
        this.centerY = centerY;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBordersWidth() {
        return bordersWidth;
    }

    public void setBordersWidth(int bordersWidth) {
        this.bordersWidth = bordersWidth;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public String getFillColor() {
        return fillColor;
    }

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    public int getCenterX() {
        return centerX;
    }

    public void setCenterX(int centerX) {
        this.centerX = centerX;
    }

    public int getCenterY() {
        return centerY;
    }

    public void setCenterY(int centerY) {
        this.centerY = centerY;
    }

    protected abstract float calcSquare();

    public void fillWithColor(String color) {
        this.fillColor = color;
        isFilled = true;
    }

    public String getShapeParameters() {
        return name + " with: square=" + calcSquare() +
                ", bordersWidth=" + bordersWidth +
                ", isFilled=" + isFilled +
                ", fillColor=" + fillColor + "\n";
    }
}
