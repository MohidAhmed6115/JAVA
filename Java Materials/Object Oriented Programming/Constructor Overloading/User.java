public class User {
    String username;
    String email;
    int age;

    public User(String name) {
        this.username = name;
        this.email = "Not Provided";
        this.age = 0;
    }
    public User(String name, int age) {
        this.username = name;
        this.email = "Not Provided";
        this.age = age;
    }
    public User(String name, String email, int age) {
        this.username = name;
        this.email = email;
        this.age = age;
    }
}