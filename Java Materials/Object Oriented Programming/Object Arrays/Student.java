public class Student {
    String name;
    int id;
    boolean isEnrolled;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.isEnrolled = false;
    }
    void enroll()
    {
        System.out.println("Student is Enrolled Successfully!");
        isEnrolled = true;
    }
    void display()
    {
        System.out.println("------------------------");
        System.out.println("Name  : " + name);
        System.out.println("ID    : " + id);
        System.out.println("Status: " + (isEnrolled ? "Enrolled" : "Not Enrolled"));
        System.out.println("------------------------");
    }
}