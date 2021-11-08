import java.util.Scanner;

public class PrimeNumber {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean primeFlag = true;

        for (int i = 2; i < n; i++) {
            if (n%i==0) {
                primeFlag = false;
                break;
            }
        }

        if (primeFlag) System.out.println("Prime number");
        else System.out.println("Not a prime number");
        
        sc.close();
    }
}
