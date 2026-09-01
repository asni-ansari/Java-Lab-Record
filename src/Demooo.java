class A{
    void show(){
        System.out.println("Show from base class A");
    }

}

class B extends A{
    void show(){
        System.out.println("Show from derived class B");
    }
}

class C extends A{
    void show(){
        System.out.println("Show from derived class C");
    }
}

class Demooo{
    public static void main(String[] args){
        C c = new C();
        c.show();
        C obj = new C();
        obj = new C();
    }
}