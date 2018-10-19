package prove;

public class Prove2 {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        A[] v = {a, b, c};

//        for (int i = 0; i < 3; i++) {
//        System.out.println(v[i].calcola());
//        }
        for (A elemento : v) {
            System.out.println(elemento.calcola());
        }

    }

}

class A {

    public A() {
        System.out.println("Sono A");
    }

    public String calcola() {
        return "Calcolo con modalità di A";
    }
}

class B extends A {

    public B() {
        super();
        System.out.println("Sono B");
    }

    public void stampa() {
        System.out.println("Stampo da B");
    }

    public String calcola() {
        return "Calcolo con modalità di B";
    }
}

class C extends B {

    public C() {
        super();
        System.out.println("Sono C");
    }

    public void stampa() {
        System.out.println("Stampo da C");
    }

    public String calcola() {
        return "Calcolo con modalità di C";
    }
}
