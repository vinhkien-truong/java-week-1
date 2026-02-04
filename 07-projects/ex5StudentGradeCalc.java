import java.util.Scanner;
public class ex5StudentGradeCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int n;
        while (true) {
            System.out.print("Enter the number of subjects: ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n > 0) { 
                    break; 
                } else {
                    System.out.println("Number of subjects must be greater than 0.");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // discard invalid token
            }
        }
        
        int[] marks = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("Enter marks for subject " + (i + 1) + ": ");
                if (scanner.hasNextInt()) {
                    int mark = scanner.nextInt();
                    if (mark >= 0 && mark <= 100) { 
                        marks[i] = mark;
                        total += mark;
                        break;
                    } else {
                        System.out.println("Marks must be between 0 and 100.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter an integer.");
                    scanner.next(); // discard invalid token
                }
            }
        }

        double average = (double) total / n;
        char grade;

        if (average >= 80) {
            grade = 'A';
        } else if (average >= 60) {
            grade = 'B';
        } else if (average >= 40) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        System.out.println("Total marks: " + total);
        System.out.println("Average marks: " + average);
        System.out.println("Grade: " + grade);
    }
}