public class Main {
    public static void main(String[] args) {

        Point point = new Point(2.6, 3.8);

        point.setX(4.1);
        point.setY(2.2);

        System.out.println("Współrzędne punktu:");
        System.out.println("x: " + point.getX());
        System.out.println("y: " + point.getY());
    }
}