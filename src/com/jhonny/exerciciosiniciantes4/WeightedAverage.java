package com.jhonny.exerciciosiniciantes4;

import java.util.Scanner;

public class WeightedAverage {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int quantity = scanner.nextInt();
		double array[] = new double[quantity];

		for (int i = 0; i < quantity; i++) {
			double number = scanner.nextDouble();
			double number2 = scanner.nextDouble();
			double number3 = scanner.nextDouble();

			double sum = (number * 2.0 + number2 * 3.0 + number3 * 5) / 10;
			array[i] = sum;

		}
		for (double a : array) {
			System.out.printf("%.1f%n", a);
		}

		scanner.close();
	}

}
