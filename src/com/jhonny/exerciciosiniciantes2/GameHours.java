package com.jhonny.exerciciosiniciantes2;

import java.util.Scanner;

public class GameHours {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int startTime = scanner.nextInt();
		int endTime = scanner.nextInt();
		int duration = 24;

		if (startTime < endTime) {
			duration = endTime - startTime;
			System.out.println("O JOGO DUROU " + duration + " HORAS(S)");
		} else {
			duration = 24 - startTime + endTime;
			System.out.println("O JOGO DUROU " + duration + " HORAS(S)");
		}

		scanner.close();
	}

}
