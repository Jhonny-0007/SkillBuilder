package com.jhonny.exerciciosiniciantes1;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int firstNumber = sc.nextInt();
		int twoNumber = sc.nextInt();
		System.out.println("SOMA = " + (firstNumber + twoNumber));
		sc.close();
	}

}
