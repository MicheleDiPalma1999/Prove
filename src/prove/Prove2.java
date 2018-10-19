package prove;

public class Prove2 {

    public static void main(String[] args) {
        A a = new B();  
        B b = new B();
    }

}

class A {

    public A() {
        System.out.println("Sono A");
    }
}

class B extends A {
    
    public B(){
        System.out.println("Sono B");
    }
}