package com.jhonny.exerciciosiniciantes3;

import java.util.Scanner;

public class Coordinates {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int xAxis = scanner.nextInt(), yAxis = scanner.nextInt();

		while (xAxis != 0 && yAxis != 0) {
			if (xAxis > 0 && yAxis > 0) {
				System.out.println("primeiro");
			} else if (xAxis > 0 && yAxis < 0) {
				System.out.println("quarto");
			} else if (xAxis < 0 && yAxis < 0) {
				System.out.println("terceiro");
			} else if (xAxis < 0 && yAxis > 0) {
				System.out.println("segundo");
			}
			xAxis = scanner.nextInt();
			yAxis = scanner.nextInt();
		}

		scanner.close();
	}

}
