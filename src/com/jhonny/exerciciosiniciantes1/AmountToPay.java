package com.jhonny.exerciciosiniciantes1;

import java.util.Scanner;

public class AmountToPay {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int productCode = scanner.nextInt();
		int quantity = scanner.nextInt();
		double productPrice = scanner.nextDouble();
		int productCode2 = scanner.nextInt();
		int quantity2 = scanner.nextInt();
		double productPrice2 = scanner.nextDouble();
		double totalPrice = (productPrice * quantity) + (quantity2 * productPrice2);

		System.out.println("VALOR DO PRODUTO " + productCode + ": " + productPrice);
		System.out.println("VALOR DO PRODUTO " + productCode2 + ": " + productPrice2);
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", totalPrice);

		scanner.close();

	}

}
