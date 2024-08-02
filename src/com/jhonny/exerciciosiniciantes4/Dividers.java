package com.jhonny.exerciciosiniciantes4;

import java.util.Scanner;

public class Dividers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		for(int i =1; i <= 6; i++) {
			if(number % i == 0) {
				System.out.println(i);
				
			}
		}
	
		
		
		
		
		
		scanner.close();
	}

}
