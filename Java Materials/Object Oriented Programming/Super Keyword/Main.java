public class Main {
    public static void main(String[] args) {
        Person person = new Person("Hanan", "Shafay");
        Student student = new Student("Mohid", "Ahmed", 3.93);
        person.showName();
        student.showName();
        student.showGPA();
    }
}