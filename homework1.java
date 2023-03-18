package Main;

import java.util.Scanner;

public class homework1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Input first number");
		int num1 = sc.nextInt();
		System.out.println("Input second number");
		int num2 = sc.nextInt();
		System.out.println("Input third number");
		int num3 = sc.nextInt();
		System.out.println("Input fourth number");
		int num4 = sc.nextInt();
		int max;

		max = num1;
		if (num2 > max) {
			max = num2;
		}
		if (num3 > max) {
			max = num3;
		}
		if (num4 > max) {
			max = num4;
		}

		System.out.println("Max number is " + max);

	}

}
