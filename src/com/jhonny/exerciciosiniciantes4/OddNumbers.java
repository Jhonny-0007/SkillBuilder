package com.jhonny.exerciciosiniciantes4;
import java.util.Scanner;

public class OddNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt();

		for (int i = 1; i <= number; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

		scanner.close();

	}

}
