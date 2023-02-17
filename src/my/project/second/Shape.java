package my.project.second;

public interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

class Circle implements Shape{
    double radius;

    public Circle(double radius){
        this.radius=radius;
    }
    @Override
    public double calculateArea() {
        return 3.14*radius*radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2+(3.14*radius);
    }
}
class Square implements Shape {
    double side;
    Square(double side){
        this.side=side;
    }
    @Override
    public double calculateArea() {
        return side*side;
    }
    @Override
    public double calculatePerimeter() {
        return 4*side;
    }

    public static void main(String[] args) {
        Circle circle=new Circle(5);
        System.out.println("Area of circle "+circle.calculateArea());
        System.out.println("Perimeter of circle "+circle.calculatePerimeter());

        Square square=new Square(7);
        System.out.println("Area of square "+square.calculateArea());
        System.out.println("Perimeter of square "+square.calculatePerimeter());


    }
}