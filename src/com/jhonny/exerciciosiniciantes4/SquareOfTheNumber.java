package com.jhonny.exerciciosiniciantes4;

import java.util.Scanner;

public class SquareOfTheNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		for (int i=1; i<=number; i++) {
			int firstLine = i;
			int secondLine = i * i;
			int thirdLine = i * i * i;
			System.out.printf("%d %d %d%n", firstLine, secondLine, thirdLine);
		}
		
		
		
		
		
		scanner.close();
	}

}
