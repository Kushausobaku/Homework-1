package Main;

import java.util.Scanner;

public class homework8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Input 6-digit number");
		int num = sc.nextInt();

		int num1 = num / 100000;
		int num2 = num % 100000 / 10000;
		int num3 = num % 10000 / 1000;
		int num4 = num % 1000 / 100;
		int num5 = num % 100 / 10;
		int num6 = num % 10 / 1;

		if (num1 == num6 && num2 == num5 && num3 == num4) {
			System.out.println("This number is palindrome");
		} else {
			System.out.println("This number is not palindrome");
		}

	}

}
