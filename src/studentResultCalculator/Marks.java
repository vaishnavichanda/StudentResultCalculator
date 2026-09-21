package studentResultCalculator;

import java.util.Scanner;

public class Marks {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("===== MARKS =====");

	        System.out.print("Enter Subject 1 marks: ");
	        int mark1 = sc.nextInt();

	        System.out.print("Enter Subject 2 marks: ");
	        int mark2 = sc.nextInt();

	        System.out.print("Enter Subject 3 marks: ");
	        int mark3 = sc.nextInt();

	        System.out.println("Subject 1: " + mark1);
	        System.out.println("Subject 2: " + mark2);
	        System.out.println("Subject 3: " + mark3);

	        sc.close();
}
}
