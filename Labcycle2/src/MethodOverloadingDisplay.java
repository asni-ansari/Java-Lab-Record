class Display {
    void display(int n) {
        System.out.println("Integer : " + n);
    }

    void display(double n) {
        System.out.println("Double : " + n);
    }

    void display(String text) {
        System.out.println("String : " + text);
    }
}

public class MethodOverloadingDisplay {
    public static void main(String[] args) {
        Display d = new Display();

        d.display(10);
        d.display(25.6);
        d.display("Java");
    }
}