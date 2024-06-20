package com.jhonny.exerciciosiniciantes2;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt();

		if (number < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("NAO NEGATIVO");
		}

		scanner.close();
	}

}
