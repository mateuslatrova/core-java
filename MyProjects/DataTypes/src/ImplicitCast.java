public class ImplicitCast {
    
    public static void main(String[] args) {
        
        // happens when you assign a lower type to a higher one.
        byte b = 100;
        int i = b; // here.
        System.out.println(i);

        long l = i;

        char ch = 'A';
        int x = ch;
        System.out.println(x);
    }
}
