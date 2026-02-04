import java.util.Scanner;


public class ex2GuessingGame {
    public static void main(String[] args)
    {
        int randomNum = (int)(Math.random() * 100) + 1;
        System.out.println(randomNum);
        guessNum(randomNum);

    }

    private static void guessNum(int randomNum) {
        System.out.println("guess the number");
        int result;
        Scanner scanner = new Scanner(System.in);
         while (true)
        {
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid number");
                scanner.next(); // discard invalid input
                continue;
            }
            result = scanner.nextInt();
            if (result == randomNum)
            {
                System.out.println("correct ! the num is :" + randomNum);
                break;
            }
            else
            {
                System.out.println(
                    result < randomNum ? "Number too low" : "Number too high"
                );            
            }
        }
    }
}
