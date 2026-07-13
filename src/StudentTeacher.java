import java.util.Scanner;

class Student {
    String name;
    int age;

    void getData() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        name = input.nextLine();

        System.out.print("Enter Student Age: ");
        age = input.nextInt();
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}

class Teacher {
    String teacherName;

    void getTeacher() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Teacher Name: ");
        teacherName = input.nextLine();
    }

    void displayTeacher() {
        System.out.println("Teacher Name: " + teacherName);
    }
}

public class StudentTeacher {
    public static void main(String[] args) {

        Student s = new Student();
        Teacher t = new Teacher();

        s.getData();
        t.getTeacher();

        System.out.println("\n----- Details -----");
        s.display();
        t.displayTeacher();
    }
}