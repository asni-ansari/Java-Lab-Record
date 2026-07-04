class Demo {
    Demo() {
        System.out.println("Object Created");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object Destroyed");
    }
}

public class GarbageCollectionDemo {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();

        d1 = null;
        d2 = null;

        System.gc();

        System.out.println("Garbage Collection Requested");
    }
}