package superkeyword;

public class Child extends Parent {
    
    int c, d;

    public Child(int a, int b,int c, int d) {
        super(a,b); // must be first line.
        this.c = c;
        this.d = d;
    }

    void displayDetails() {
        System.out.println("Parents a " + super.a);
        System.out.println("Parents b " + super.b);
        System.out.println("Childs c " + this.c);
        System.out.println("Childs d " + this.d);
    }

    @Override
    void f1() {
        super.f1();
        System.out.println("Inside childs f1()");
    }
}
