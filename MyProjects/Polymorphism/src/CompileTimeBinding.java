public class CompileTimeBinding {

    // Method overloading:
    void add(int a, int b) {
        int result = a+b;
        System.out.println("Result is: "+result);
    }

    void add(float a, float b) {
        float result = a+b;
        System.out.println("Result is: "+result);
    }

    void add(int a, int b, int c) {
        int result = a+b+c;
        System.out.println("Result is: "+result);
    }

    public static void main(String[] args) throws Exception {
        
        CompileTimeBinding ctb = new CompileTimeBinding();
        ctb.add(1,2);
        ctb.add(1.0f,7.0f);
        ctb.add(1,2,3);
    }
}
