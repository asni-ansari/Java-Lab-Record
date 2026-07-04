class Test {
    Test() {
        System.out.println("Object Created");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize() method called");
    }
}

public class FinalizeDemo {
    public static void main(String[] args) {
        Test t = new Test();

        t = null;

        System.gc();
    }
}