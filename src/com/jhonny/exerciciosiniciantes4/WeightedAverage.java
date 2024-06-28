package com.jhonny.exerciciosiniciantes4;

import java.util.Scanner;

public class WeightedAverage {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int quantity = scanner.nextInt();

		for (int i = 1; i <= quantity; i++) {
			double number = scanner.nextDouble();
			double number2 = scanner.nextDouble();
			double number3 = scanner.nextDouble();

			number *= 2;
			number2 *= 3;
			number3 *= 5;
			double sum = (number + number2 + number3) / 10;
			System.out.printf("%.1f%n", sum);
		}
		
		

		scanner.close();
	}

}
