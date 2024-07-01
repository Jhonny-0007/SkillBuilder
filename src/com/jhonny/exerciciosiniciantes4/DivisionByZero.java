package com.jhonny.exerciciosiniciantes4;

import java.util.Scanner;

public class DivisionByZero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int quantity = scanner.nextInt();

		for (int i = 0; i < quantity; i++) {
			double number = scanner.nextDouble();
			double number2 = scanner.nextDouble();

			double division = number / number2;
			if (number2 == 0) {
				System.out.println("divisao impossivel");
			} else {
				System.out.printf("%.1f%n", division);
			}

		}

		scanner.close();
	}

}
