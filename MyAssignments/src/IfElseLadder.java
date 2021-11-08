public class IfElseLadder {
    
    public static void main(String[] args) {
        int math = 30, physics = 45, chemistry = 70;

        if (math < 35 || physics < 35 || chemistry < 35) System.out.println("Result: Failed");
        else {
            int average = (math + physics + chemistry)/3;
            if (average <= 59) System.out.println("Result: C");
            if (average <= 69) System.out.println("Result: B");
            else System.out.println("Result: A");
        }
    }
}
