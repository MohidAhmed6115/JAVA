import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Hanan");
        students.add("Mohid");
        students.add("Umair");
        students.add("Hamza");
        students.add("Haseeb");
        students.add("Superman");
        students.add("Hassaan");

        students.remove(5);
        students.set(5, "Akbar");
        System.out.println(students.get(5));

        Collections.sort(students);
        System.out.println(students.size());
        // System.out.println(students.get(3));

        for(String student : students)
            System.out.println(student);
    }
}