package p2;

import p1.A;

public class C extends A {
    
    public static void main(String[] args) {
        
        A aObj = new A();

        //System.out.println(aObj.b); inside other package
         // System.out.println(aObj.c); must be acessed in a C instance.
        System.out.println(aObj.d);

        C cObj = new C();
        System.out.println(cObj.c);
        System.out.println(cObj.d);
    }
}
