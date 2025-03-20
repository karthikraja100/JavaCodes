package dailycodes;
public class OddLetterPattern {
    public static void main(String[] args) {
        String word = "PROGRAM";
        int length = word.length();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                // Print characters at the correct diagonal positions
                if (j == i || j == length - i - 1) {
                    System.out.print(word.charAt(j));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next row
        }
    }
}
