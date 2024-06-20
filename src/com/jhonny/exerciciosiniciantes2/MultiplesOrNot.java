package com.jhonny.exerciciosiniciantes2;

import java.util.Scanner;

public class MultiplesOrNot {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();

		if (number1 % number2 == 0 || number2 % number1 == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}

		scanner.close();
	}

}
