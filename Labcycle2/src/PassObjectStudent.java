class Students {
    String name;
    int rollNo;

    Students(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}

public class PassObjectStudent {

    static void display(Students s) {
        System.out.println("Student Name : " + s.name);
        System.out.println("Roll No : " + s.rollNo);
    }

    public static void main(String[] args) {
        Students s = new Students("Neha", 25);

        display(s);
    }
}