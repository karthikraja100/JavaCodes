package dailycodes;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> bookings = new LinkedList<>();

        while (true) {
            System.out.println("\n1. Book Ticket\n2. Cancel Ticket\n3. View Tickets\n4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();  // Consume newline

            if (choice == 1) {
                System.out.print("Enter passenger name: ");
                String name = sc.nextLine();
                bookings.add(name);
                System.out.println("Ticket booked for " + name);
            } 
            else if (choice == 2) {
                if (!bookings.isEmpty()) {
                    System.out.println("Cancelled ticket for " + bookings.poll());
                } else {
                    System.out.println("No tickets to cancel.");
                }
            } 
            else if (choice == 3) {
                if (bookings.isEmpty()) {
                    System.out.println("No bookings available.");
                } else {
                    System.out.println("Booked Tickets: " + bookings);
                }
            } 
            else if (choice == 4) {
                System.out.println("Exiting...");
                break;
            } 
            else {
                System.out.println("Invalid choice! Try again.");
            }
        }
        sc.close();
    }
}
