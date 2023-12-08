package goit.homeworks;

public class Main {

    public static void main(String[] args){

        Circle circle = new Circle(1, 30, 40, 100);
        getShapeParameters(circle);

        Shape triangle = new Triangle(1, "0000FF", 10, 40, 14, 55, 45);
        getShapeParameters(triangle);

        Shape rectangle = new Rectangle(1, 100, 200, 50, 90);
        rectangle.fillWithColor("#0000");
        getShapeParameters(rectangle);

        Line line = new Line(1, "#4f4f4f", 12, 78, 88,100);
        getShapeParameters(line);

        Square square = new Square(1, 200, 140, 14);
        getShapeParameters(square);

        System.out.println("\nScaling square: ");
        square.scale(1.1f);
        getShapeParameters(square);

        System.out.println("\nScaling square: ");
        circle.scale(2f);
        getShapeParameters(circle);

    }

    private static void getShapeParameters(Shape shape) {
        System.out.println(shape.getShapeParameters());
    }

}
