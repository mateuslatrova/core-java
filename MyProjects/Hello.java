public class Hello {

    public static void main(String[] args) {
        System.out.printf("Hello world!");
    }

    static {
        System.out.println("Static block 1");
    }

    
    static {
        System.out.println("Static block 2");
    }
}