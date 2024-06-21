package com.jhonny.exerciciosiniciantes2;

import java.util.Scanner;

public class BuyProduct {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double rotDog = 4.0;
		double xSalad = 4.5;
		double xBacon = 5.0;
		double simpleToast = 2.0;
		double refrigerator = 1.5;
		int code = scanner.nextInt();
		int amount = scanner.nextInt();
		double price;
		
		if(code == 1) {
			price = rotDog * amount;
		}else if(code == 2) {		
			price = xSalad * amount;
		}else if (code == 3) {
			price = xBacon * amount;
		}else if (code == 4) {
			price = simpleToast * amount;
		}else {
			price = refrigerator * amount;
		}
		System.out.printf("Total: R$ %.2f%n", price);
		
		
		
		
		scanner.close();
	}

}
