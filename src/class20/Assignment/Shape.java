package class20.Assignment;

public class Shape {
    double radius;

    Shape(double radius) {
        this.radius = radius;
    }
}
    class Circle extends Shape {
        double pie = 3.14;

        Circle(double radius) {
            super(radius);
        }

        void area() {
            System.out.println("The area of circle is " + pie * (radius * radius));
        }

    }
