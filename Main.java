import geometry.Point;
import geometry.Circle;
import geometry.ColoredCircle;

public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(new Point(0, 0), 3);
        circles[1] = new Circle(new Point(4, 1), 4);
        circles[2] = new ColoredCircle(new Point(-2, 3), 5, "red");

        for (Circle circle : circles) {
            double area = circle.getArea();
            System.out.println("Pole powierzchni: " + area);

            if (circle instanceof ColoredCircle) {
                ColoredCircle coloredCircle = (ColoredCircle) circle;
                String color = coloredCircle.getColor();
                System.out.println("Kolor koła: " + color);
            }
        }
    }
}