import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.printf("Grade A\n");
        } else if (marks >= 80 && marks < 90) {
            System.out.printf("Grade B\n");
        } else if (marks >= 70 && marks < 80) {
            System.out.printf("Grade C\n");
        } else if (marks >= 60 && marks < 70) {
            System.out.printf("Grade D\n");
        } else {
            System.out.println("Grade F");
        }
        
        sc.close();  // Close the scanner to prevent resource leaks
    }
}
