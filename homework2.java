package Main;

import java.util.Scanner;

public class homework2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Input apartment number");
		int numapart = sc.nextInt();
		int enter;
		
		if (numapart<1 || numapart>9*4*4) {
			System.out.println("Sorry, but this apartment doesn't exist.");
		}

		/**
		 * 1 подъезд
		 */
		if (numapart >= 1 && numapart <= 36) {
			enter = 1;
			int floor1 = (int) (numapart / 4.1);
			if (floor1 < 1) {
				floor1 = 1;
			}
			System.out.println("Its " + enter + " entrance, " + floor1 + " floor");
		}
		/**
		 * 2 подъезд
		 */
		if (numapart >= 9 * 4 + 1 && numapart <= 9 * 4 * 2) {
			enter = 2;
			int floor2 = (int) ((numapart - 9 * 4) / 4.1);
			if (floor2 < 1) {
				floor2 = 1;
			}
			System.out.println("Its " + enter + " entrance, " + floor2 + " floor");
		}
		/**
		 * 3 подъезд
		 */
		if (numapart >= 9 * 4 * 2 + 1 && numapart <= 9 * 4 * 3) {
			enter = 3;
			int floor3 = (int) (numapart - 9 * 4 * 2) / 4;
			if (floor3 < 1) {
				floor3 = 1;
			}
			System.out.println("Its " + enter + " entrance, " + floor3 + " floor");
		}
		/**
		 * 4 подъезд
		 */
		if (numapart >= 9 * 4 * 3 + 1 && numapart <= 9 * 4 * 4) {
			enter = 4;
			int floor4 = (int) (numapart - 9 * 4 * 3) / 4;
			if (floor4 < 1) {
				floor4 = 1;
			}
			System.out.println("Its " + enter + " entrance, " + floor4 + " floor");
		}

	}

}
