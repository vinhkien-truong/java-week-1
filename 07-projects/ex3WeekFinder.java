import java.util.Scanner;

public class ex3WeekFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number between 1-7");
        while(true) {
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid number");
                scanner.next(); // discard invalid input
                continue;
            }
            int userDay =  scanner.nextInt();
            String result;
            switch (userDay) {
                case 1 -> result = "Monday";
                case 2 -> result = "Tuesday";
                case 3 -> result = "Wednesday";
                case 4 -> result = "Thursday";
                case 5 -> result = "Friday";
                case 6 -> result = "Saturday";
                case 7 -> result = "Sunday";
            
                default -> result = "error";
            }
            if (result.equals("error")) {
                System.out.println("please enter a correct number between 1-7");
            }
            else {
                System.out.println(result);
                break;
            }

        }
        
    }
}
