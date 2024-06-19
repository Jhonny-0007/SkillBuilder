package com.jhonny.exerciciosiniciantes1;

import java.util.Scanner;

public class SalaryCalculation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numberEmployee = scanner.nextInt();
		int workedHours = scanner.nextInt();
		double salary = scanner.nextDouble();
		
		double salaryCalculation = salary * workedHours;
		
		System.out.println("NUMBER = " + numberEmployee);
		System.out.printf("SALARY = U$ %.2f%n", salaryCalculation);
		
		scanner.close();
	}

}
