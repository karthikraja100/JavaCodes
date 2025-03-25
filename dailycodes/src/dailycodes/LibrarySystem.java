package dailycodes;
import java.util.*;
class Book {
    String title, author, genre;
    boolean isBorrowed;

    Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isBorrowed = false;
    }
}
public class LibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        while (true) {
        	System.out.println("\n1. Add Book\n2. View All Books\n3. Search by Genre\n4. Borrow Book\n5. Return Book\n6. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();        
           if (choice == 1) {
            System.out.print("Enter book title: ");
            String title = sc.nextLine();
            System.out.print("Enter author: ");
            String author = sc.nextLine();
            System.out.print("Enter genre: ");
            String genre = sc.nextLine();
            books.add(new Book(title, author, genre));
            System.out.println("Book added!");
        } 
           else if (choice == 2) {
            if (books.isEmpty()) {
                System.out.println("No books available.");
            } else {
                for (Book b : books) {
                    System.out.println(b.title + " by " + b.author + " [Genre: " + b.genre + "]" +(b.isBorrowed ? "- borrowed ":" "));
                }
            }
        } 
           else if (choice == 3) {
            System.out.print("Enter genre to search: ");
            String searchGenre = sc.nextLine();
           
            for (Book b : books) {
                if (b.genre.equalsIgnoreCase(searchGenre)) {
                    System.out.println(b.title + " by " + b.author);   
                }else {
             System.out.println("No books found in this genre.");
            }
          }  
        } else if (choice == 4) {
            System.out.print("Enter book title to borrow: ");
            String btitle = sc.nextLine();
            boolean found = false;
            for (Book b : books) {
                if (b.title.equalsIgnoreCase(btitle) && !b.isBorrowed) {
                    b.isBorrowed =true;
                    System.out.println("You have borrowed: " + b.title);
                    found = true;
                    break;
                } else if (b.title.equalsIgnoreCase(btitle) && b.isBorrowed) {
                    System.out.println("Sorry, this book is already borrowed.");
                    found = true;
                    break;
                }
            }
            if (!found) System.out.println("Book not found.");
        } else if (choice == 5) {
            System.out.print("Enter book title to return: ");
            String returnTitle = sc.nextLine();
            boolean found = false;
            for (Book b : books) {
                if (b.title.equalsIgnoreCase(returnTitle) && b.isBorrowed) {
                    b.isBorrowed = false;
                    System.out.println("You have returned: " + b.title);
                    found = true;
                    break;
                } else if (b.title.equalsIgnoreCase(returnTitle) && !b.isBorrowed) {
                    System.out.println("This book was not borrowed.");
                    found = true;
                    break;
                }
            }
            if (!found) System.out.println("Book not found.");
        } else if (choice == 6) {
            System.out.println("Thankyou!");
            break;
        } else {
            System.out.println("Invalid choice, try again.");
        }
    }
    sc.close();

    }
    }
