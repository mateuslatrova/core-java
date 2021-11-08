import static java.lang.Math.*;

import java.util.Scanner;

public class StaticImport {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double num = sc.nextDouble();

        double sqrt = sqrt(num);
        double squared = pow(num,2); 
        
        System.out.println("Squared root of your number: " + sqrt);
        System.out.println("Your number squared: " + squared);
    }
}
