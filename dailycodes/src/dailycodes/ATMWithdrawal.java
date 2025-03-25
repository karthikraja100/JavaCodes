package dailycodes;

import java.util.Scanner;

public class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        double Y = sc.nextDouble();
        
        if (X % 100 == 0 && X + 5 <= Y) {
            Y -= (X + 5);
        }
        
        System.out.printf("%.2f\n", Y);
        sc.close();
    }
}
