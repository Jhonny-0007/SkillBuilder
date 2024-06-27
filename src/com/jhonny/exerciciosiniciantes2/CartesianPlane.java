package com.jhonny.exerciciosiniciantes2;

import java.util.Scanner;

public class CartesianPlane {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double xAxis = scanner.nextDouble();
		double yAxis = scanner.nextDouble();

		if (xAxis > 0 && yAxis < 0) {
			System.out.println("Q4");
		} else if (xAxis > 0 && yAxis > 0) {
			System.out.println("Q1");
		} else if (xAxis == 0 && yAxis == 0) {
			System.out.println("Origem");
		} else if (xAxis < 0 && yAxis > 0) {
			System.out.println("Q2");
		} else {
			System.out.println("Q3");
		}

		scanner.close();
	}

}
