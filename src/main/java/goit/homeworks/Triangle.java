package goit.homeworks;

public class Triangle extends Shape implements Scalable {

    private float leftSide;
    private float botSide;
    private float rightSide;

    public Triangle(int bordersWidth, int centerX, int centerY, float leftSide, float botSide, float rightSide) {
        super("Triangle", bordersWidth, centerX, centerY);
        this.leftSide = leftSide;
        this.botSide = botSide;
        this.rightSide = rightSide;
    }

    public Triangle(int bordersWidth, String fillColor, int centerX, int centerY, float leftSide, float botSide, float rightSide) {
        super("Triangle", bordersWidth, fillColor, centerX, centerY);
        this.leftSide = leftSide;
        this.botSide = botSide;
        this.rightSide = rightSide;
    }

    public double getLeftSide() {
        return leftSide;
    }

    public void setLeftSide(float leftSide) {
        this.leftSide = leftSide;
    }

    public double getBotSide() {
        return botSide;
    }

    public void setBotSide(float botSide) {
        this.botSide = botSide;
    }

    public double getRightSide() {
        return rightSide;
    }

    public void setRightSide(float rightSide) {
        this.rightSide = rightSide;
    }

    @Override
    protected float calcSquare() {
        float hp = (leftSide + botSide + rightSide) / 2;
        var a = hp*(hp-leftSide)*(hp-botSide)*(hp-rightSide);

        if (a < leftSide || a < botSide || a < rightSide) {
            throw new RuntimeException("Triangle doesn't exists");
        }
        return (float) Math.sqrt(a);
    }

    @Override
    public void scale(float value) {
        this.rightSide = (rightSide * value);
        this.leftSide = (leftSide * value);
        this.botSide = (botSide * value);
    }
}
