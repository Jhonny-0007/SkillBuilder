package com.jhonny.exerciciofixacao3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Student student = new Student();
		student.setName(scanner.nextLine());
		student.setNota1(scanner.nextDouble());
		student.setNota2(scanner.nextDouble());
		student.setNota3(scanner.nextDouble());

		student.pass();

		scanner.close();
	}

}
