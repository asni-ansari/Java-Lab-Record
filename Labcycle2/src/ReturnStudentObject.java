class Studentt {
    String name;
    int mark;

    Studentt(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }
}

public class ReturnStudentObject {

    static Studentt getStudent() {
        return new Studentt("Arun", 87);
    }

    public static void main(String[] args) {
        Studentt s = getStudent();

        System.out.println("Student Name : " + s.name);
        System.out.println("Mark : " + s.mark);
    }
}