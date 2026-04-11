public class Main {
    public static void main(String[] args) {
        // cannot instantiat Shape class because it is abstract
        // Shape shape = new Shape();

        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4, 5);
        Rectangle rectangle = new Rectangle(6, 7);

        circle.display();
        System.out.println(circle.area());
        triangle.display();
        System.out.println(triangle.area());
        rectangle.display();
        System.out.println(rectangle.area());

    }
}