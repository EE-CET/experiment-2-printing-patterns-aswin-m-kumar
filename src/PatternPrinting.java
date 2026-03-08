import java.util.Scanner;
public class PatternPrinting {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 1; i<n; i++) {
            System.out.print("* ");}
        for (int j = 1; j<=n+1; j++) {
                System.out.println("* ");
        }
        sc.close();
    }
}
