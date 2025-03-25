package dailycodes;

import java.util.Scanner;

public class SmartParking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int cost = (H <= 3) ? (H * 20) : (3 * 20 + (H - 3) * 15);
        
        System.out.println(cost);
        sc.close();
    }
}
