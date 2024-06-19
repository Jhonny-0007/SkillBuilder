package com.jhonny.exerciciosiniciantes1;

import java.util.Scanner;

public class CircleRadius {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double area = sc.nextDouble();
		double pi = 3.14159;
		
		area *= area * pi;
		
		System.out.printf("A=%.4f%n", area);
		
		sc.close();
	}

}
