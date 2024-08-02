package com.jhonny.exerciciofixacao1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter rectangle width and height:");
		rectangle.setWidth(scanner.nextDouble());
		rectangle.setHeight(scanner.nextDouble());
		System.out.printf("AREA = %.2f%n", rectangle.area());
		System.out.printf("PERIMETER = %.2f%n", rectangle.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rectangle.diagonal());
		
		scanner.close();
	}

}
