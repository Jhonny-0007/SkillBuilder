package com.jhonny.exerciciosiniciantes2;

import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double salary = scanner.nextDouble();
		
		
		
		if(salary <= 2000) {
			System.out.println("Insento");
		}else if(salary > 2000 && salary < 3000) {
			salary = (salary - 2000) * 0.8;
			System.out.println(salary);
		}else if (salary > 3000 && salary < 4500) {
			
		}
		
		
		
		scanner.close();
	}

}
