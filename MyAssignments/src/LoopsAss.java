import java.util.Scanner;

public class LoopsAss {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Using for:");
        for (int i = 0; i <= n; i++) {
            if (i%10 == 0) continue;
            else if (i > 100) break;

            System.out.println(i);
        }

        System.out.println("\nUsing while:");
        int i = 0;
        while (i < n && i < 100) {
            i++;
            if (i%10 == 0) continue;
            System.out.println(i);
        }

        System.out.println("\nUsing do-while:");
        i = 0;
        do {
            i++;
            if (i%10 == 0) continue;
            System.out.println(i);
        } while (i < n && i < 100);
    }
}
