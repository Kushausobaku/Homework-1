package Main;

import java.util.Scanner;

public class homework7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Input 4-digital number");
		int num = sc.nextInt();
		int num1 = num / 1000;
		int num2 = num % 1000 / 100;
		int num3 = num % 100 / 10;
		int num4 = num % 10 / 1;

		if (num1 + num2 == num3 + num4) {
			System.out.println("Congratulations! Its a happy ticket!");
		} else {
			System.out.println("Sorry, try next time");
		}

	}

}
