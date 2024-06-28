package com.jhonny.exerciciosiniciantes4;

import java.util.Scanner;

public class OutOfRange {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int quantity = scanner.nextInt();
		int in = 0;
		int out = 0;

		for (int i = 1; i <= quantity; i++) {
			int number = scanner.nextInt();
			if (number >= 10 && number <= 20) {
				in += 1;
			} else {
				out += 1;
			}
		}
		System.out.println("in " + in);
		System.out.println("out " + out);

		scanner.close();
	}

}
