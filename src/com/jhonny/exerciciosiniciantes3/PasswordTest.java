package com.jhonny.exerciciosiniciantes3;

import java.util.Scanner;

public class PasswordTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int password = scanner.nextInt();

		while (password != 2002) {
			System.out.println("Senha Invalida");
			password = scanner.nextInt();
		}
		System.out.println("Acesso permitido");

		scanner.close();
	}

}
