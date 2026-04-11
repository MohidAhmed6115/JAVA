public class Main {
    public static void main(String[] args) {
        // User user1 = new User("Hanan");
        User user1 = new User("Hanan", 19);
        // User user1 = new User("Hanan", "shahsuper882@gmail.com", 19);
        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);
    }
}