package com.jhonny.exerciciosiniciantes1;

import java.util.Scanner;

public class CalculateArea {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double number1 = scanner.nextDouble();
		double number2 = scanner.nextDouble();
		double number3 = scanner.nextDouble();
		
		double areaTriangle = number1 * number3 / 2;
		double areaCircle = number3 * number3 * 3.14159;
		double areaTrapeze = (number1 + number2) / 2.0 * number3;
		double areaSquare = number2 * number2;
		double areaRectangular = number1 * number2;
		
		
		System.out.printf("TRIANGULO: %.3f%n", areaTriangle);
		System.out.printf("CIRCULO: %.3f%n", areaCircle);
		System.out.printf("TRAPEZIO: %.3f%n", areaTrapeze);
		System.out.printf("QUADRADO: %.3f%n", areaSquare);
		System.out.printf("RETANGULO: %.3f%n", areaRectangular);
		
		
		scanner.close();
		
	}

}
