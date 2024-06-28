package com.jhonny.exerciciosiniciantes3;

import java.util.Scanner;

public class GasStation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int alcohol = 0;
		int gasoline = 0;
		int diesel = 0;
		int selection = scanner.nextInt();

		while (selection != 4) {
			if (selection == 1) {
				alcohol += 1;
			} else if (selection == 2) {
				gasoline += 1;
			} else if (selection == 3){
				diesel += 1;
			}
			selection = scanner.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcohol: " + alcohol);
		System.out.println("Gasoline: " + gasoline);
		System.out.println("Diesel: " + diesel);

		scanner.close();
	}

}
