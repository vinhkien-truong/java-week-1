import java.util.Scanner;

public class ex1Calculator 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int numberOne = getNumFromUser(scanner,"first");
        int numberTwo = getNumFromUser(scanner,"second");
        String operator = getOperatorFromUser(scanner);
        System.out.println("a : " + numberOne + " b : " + numberTwo + " op : " + operator);
        System.out.println("result : "+ calculate(numberOne, numberTwo, operator));
    }

    private static int getNumFromUser(Scanner scanner,String label) {
        int result = 0;
        while (true)
        {
            System.out.print("Enter the "+label+" number: ");
            if (scanner.hasNextInt())
            {
                result = scanner.nextInt();
                scanner.nextLine(); // consume leftover newline
                break;
            }
            else
            {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // discard invalid token
            }
        }
        return result;
    }
    private static String getOperatorFromUser(Scanner scanner) {
        String result;
        while (true) {
            System.out.print("Enter the operator (+ - * /): ");
            result = scanner.nextLine().trim();

            if (result.equals("+") || result.equals("-")
                    || result.equals("*") || result.equals("/")) {
                return result;
            }

            System.out.println("Invalid input. Please enter a valid operator. : " + result);
        }
    }
    private static int calculate(int a, int b, String op) {
        return switch (op) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> {
                if (b == 0) throw new ArithmeticException("Division by zero");
                yield a / b;
            }
            default -> throw new IllegalArgumentException("Invalid operator");
        };
    }
}
