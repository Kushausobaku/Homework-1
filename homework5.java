package Main;

import java.util.Scanner;

public class homework5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Input coardinate x");
		int x = sc.nextInt();
		System.out.println("Inputcoardinate y");
		int y = sc.nextInt();

		if (Math.pow(x, x) + Math.pow(y, y) > 16) {
			System.out.println("This point is not in the circle");
		} else {
			System.out.println("This point is in the circle");
		}

	}

}
