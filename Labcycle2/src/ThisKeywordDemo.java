class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Student Name : " + name);
        System.out.println("Age : " + age);
    }
}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        Student s = new Student("Anu", 20);
        s.display();
    }
}