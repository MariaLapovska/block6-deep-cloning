package ua.kpi.tef;

public class Main {

    public static void main(String[] args) {
        Point point = new Point(8, 8);
        Circle circle1 = new Circle(point, 10);
        Circle circle2 = circle1.clone();

        System.out.println(circle1 == circle2);
        System.out.println(circle1.equals(circle2));
        System.out.println(circle1.hashCode());
        System.out.println(circle2.hashCode());
        System.out.println(circle1.hashCode() == circle2.hashCode());
        System.out.println("***");

        Point point1 = new Point(8, 7);
        circle1.setCenterCircle(point1);
        System.out.println(circle1 == circle2);
        System.out.println(circle1.equals(circle2));
        System.out.println(circle1.hashCode());
        System.out.println(circle2.hashCode());
        System.out.println(circle1.hashCode() == circle2.hashCode());
        System.out.println("***");

        Rectangle rectangle1 = new Rectangle(point, point1);
        Rectangle rectangle2 = rectangle1.clone();
        System.out.println(rectangle1 == rectangle2);
        System.out.println(rectangle1.equals(rectangle2));
        System.out.println(rectangle1.hashCode());
        System.out.println(rectangle2.hashCode());
        System.out.println(rectangle1.hashCode() == rectangle2.hashCode());
        System.out.println("***");

        Point p3 = new Point(10, 15);
        rectangle1.setLeftTop(p3);
        System.out.println(rectangle1 == rectangle2);
        System.out.println(rectangle1.equals(rectangle2));
        System.out.println(rectangle1.hashCode());
        System.out.println(rectangle2.hashCode());
        System.out.println(rectangle1.hashCode() == rectangle2.hashCode());
        System.out.println("***");
    }
}
