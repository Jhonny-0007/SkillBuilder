package com.jhonny.exerciciosiniciantes4;

import java.util.Scanner;

public class CalculatesFactorial {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int multiplication = 1;
		
		for(int i = 1; i <= number; i++) {
			multiplication = multiplication * i;
		}
		System.out.println(multiplication);

		
		
		
		
		
		
		
		scanner.close();
	}

}
