public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);
        System.out.println(plant.isAlive);

        dog.eat();
        cat.eat();

        dog.speak();
        System.out.println(dog.lives);
        cat.speak();
        System.out.println(cat.lives);
        plant.photosynthesize();
    }
}