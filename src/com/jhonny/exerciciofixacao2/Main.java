package com.jhonny.exerciciofixacao2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Employee employee01 = new Employee();
		System.out.print("Name: " );
		employee01.setName(scanner.nextLine());
		System.out.print("Gross salary: ");
		employee01.setGrossSalary(scanner.nextDouble());
		System.out.print("Tax: ");
		employee01.setTax(scanner.nextDouble());
		System.out.printf("Employee: " + employee01.getName() + ", $ %.2f%n", employee01.netSalary());
		
		System.out.print("Which percentage to increase salary? ");
		double percent = scanner.nextDouble();
		System.out.printf("Updated data: " + employee01.getName() + ", $ " + employee01.increaseSalary(percent));
		
		
		
		scanner.close();
	}

}
