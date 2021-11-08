package p1;

public class A {

    private int a = 30;
    int b = 40; // default = inside package only
    protected int c = 50;
    public int d = 60;

    public static void main(String[] args) throws Exception {
        
        A aObj = new A();

        System.out.println(aObj.a);
        System.out.println(aObj.b);
        System.out.println(aObj.c);
        System.out.println(aObj.d);
    }
}
