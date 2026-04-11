
public class Main {

    public static void main(String[] args) {
        // Student student1 = new Student("Hanan", 19);
        // Student student2 = new Student("Mohid", 18);
        // Student student3 = new Student("Umair", 19);
        // Student[] students = {student1, student2, student3};

        // Student[] students = new Student[3];
        Student[] students = {new Student("Hanan", 19),
                              new Student("Mohid", 18),
                              new Student("Umair", 19)};
        students[1].enroll();

        for (Student student : students) {
            student.display();
        }
    }
}
