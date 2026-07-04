class Box {
    int length;
    int breadth;
    int height;

    Box(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    int volume() {
        return length * breadth * height;
    }
}

public class LargeBox {

    static void compare(Box b1, Box b2) {
        int v1 = b1.volume();
        int v2 = b2.volume();

        if (v1 > v2)
            System.out.println("Larger Box Volume = " + v1);
        else
            System.out.println("Larger Box Volume = " + v2);
    }

    public static void main(String[] args) {
        Box b1 = new Box(3, 4, 5);
        Box b2 = new Box(5, 4, 6);

        compare(b1, b2);
    }
}