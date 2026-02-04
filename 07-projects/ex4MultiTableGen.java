import java.util.Scanner;

public class ex4MultiTableGen {
    public static void main(String[] args) {
        System.out.println("put a number to show it's multiplication table");
        Scanner scanner = new Scanner(System.in);
        while(true) {
             if (!scanner.hasNextInt()) {
                System.out.println("Invalid number");
                scanner.next(); // discard invalid input
                continue;
            }
            int num = scanner.nextInt();
            for (int i = 1; i<=10 ; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }
            break;
        }
    }
}
