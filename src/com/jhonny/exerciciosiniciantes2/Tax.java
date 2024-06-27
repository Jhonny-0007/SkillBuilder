package com.jhonny.exerciciosiniciantes2;

import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double salary = scanner.nextDouble();
		double taxAmount = 0;
		
		if(salary > 4500) {
			taxAmount =+ (salary - 4500) * 0.28;
			salary = 4500;
		}
		if(salary > 3000) {
			taxAmount =+ (salary - 3000) * 0.18;
			salary = 3000;
		}
		if(salary > 2000) {
			taxAmount += (salary - 2000) * 0.08;
		}else {
			System.out.println("Insento");
		}
		System.out.printf("R$ %.2f%n", taxAmount);
		
		
		scanner.close();
	}

}
