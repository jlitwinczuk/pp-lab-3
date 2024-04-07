import geometry.Point;
import geometry.Circle;
import geometry.ColoredCircle;

public class Main {
    public static void main(String[] args) {

        Point center = new Point(0, 0);
        ColoredCircle coloredCircle = new ColoredCircle(center, 5.0, "yellow");

        System.out.println("Właściwości koła:");
        System.out.println("Środek koła: (" + coloredCircle.getCenter().getX() + ", " + coloredCircle.getCenter().getY() + ")");
        System.out.println("Promień koła: " + coloredCircle.getRadius());
        System.out.println("Obwód koła: " + coloredCircle.calculatePerimeter());
        System.out.println("Pole powierzchni koła: " + coloredCircle.getArea());
        System.out.println("Kolor koła: " + coloredCircle.getColor());
    }
}