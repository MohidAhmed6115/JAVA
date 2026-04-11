public class Main {
    public static void main(String[] args) {
        Car car = new Car("Mustang", "Red", 999);
        car.setPrice(1999);
        System.out.printf("%s %s: %s", car.getColor(), car.getModel(), car.getPrice());
    }
}