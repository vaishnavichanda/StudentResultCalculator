package studentResultCalculator;


import java.util.Scanner;

public class Percentage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== PERCENTAGE =====");

        System.out.print("Enter total marks out of 300: ");
        int total = sc.nextInt();

        double percentage = (total / 300.0) * 100;

        System.out.println("Percentage: " + percentage + "%");

        sc.close();
    }
}