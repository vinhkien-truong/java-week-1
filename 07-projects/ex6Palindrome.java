import java.util.Scanner;
public class ex6Palindrome {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please put a palindrome word");
        String userPalindrome;

        while (true) {
            if (scanner.hasNext()) {
                userPalindrome = scanner.next();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Invalid input. Please enter a palindrome.");
                scanner.next(); // discard invalid token
            }
        }
        boolean isPalindrome = true;
        int i = 0, j = userPalindrome.length()-1;
        while(isPalindrome) {
            if (userPalindrome.charAt(i) != userPalindrome.charAt(j)){
                isPalindrome = false;
            } else if (i >= j) {
                break;
            }
            i++;
            j--;
        }
        if (isPalindrome) {
            System.out.println("it's a palindrome");
        } else {
            System.out.println("it's not a palindrome");
        }
        
    }
}
