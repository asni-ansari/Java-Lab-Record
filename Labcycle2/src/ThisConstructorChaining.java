class Student {
    String name;
    int age;

    Student() {
        System.out.println("Default Constructor");
    }

    Student(String name, int age) {
        this();
        this.name = name;
        this.age = age;

        System.out.println("Parameterized Constructor");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

public class ThisConstructorChaining {
    public static void main(String[] args) {
        Student s = new Student("Manu", 21);
    }
}