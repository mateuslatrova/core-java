public class ExplicitCast {
    
    public static void main(String[] args) {
        
        // higher data type to lower one.
        int i = 100;
        byte b = (byte) i;

        int x = 97;

        char ch = (char) x;
        System.out.println(ch);

        int y = 130;
        byte z = (byte) y;
        System.out.println(z);
    }
}
