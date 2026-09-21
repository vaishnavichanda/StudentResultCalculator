package studentResultCalculator;

import java.util.Scanner;

public class Total {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== TOTAL MARKS =====");

        System.out.print("Enter Subject 1 marks: ");
        int mark1 = sc.nextInt();

        System.out.print("Enter Subject 2 marks: ");
        int mark2 = sc.nextInt();

        System.out.print("Enter Subject 3 marks: ");
        int mark3 = sc.nextInt();

        int total = mark1 + mark2 + mark3;

        System.out.println("Total Marks: " + total);

        sc.close();
    }
}
