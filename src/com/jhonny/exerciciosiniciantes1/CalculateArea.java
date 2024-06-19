package com.jhonny.exerciciosiniciantes1;

import java.util.Scanner;

public class CalculateArea {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double number1 = scanner.nextDouble();
		double number2 = scanner.nextDouble();
		double number3 = scanner.nextDouble();
		
		double areaTriangle = number1 * number3 / 2;
		
		System.out.printf("TRIANGULO: %.4f%n", areaTriangle);
		
		
		
		
		scanner.close();
		
	}

}
