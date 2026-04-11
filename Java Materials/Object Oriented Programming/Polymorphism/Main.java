public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle[] vehicles = {car, bike, boat};
        vehicles[0].go();
        vehicles[1].go();
        vehicles[2].go();
    }
}