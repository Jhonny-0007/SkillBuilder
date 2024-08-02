package com.jhonny.exerciciofixacao3;

public class Student {
	private String name;
	private Double nota1;
	private Double nota2;
	private Double nota3;

	public Student() {

	}

	public Student(String name, Double nota1, Double nota2, Double nota3) {
		this.name = name;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getNota1() {
		return nota1;
	}

	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}

	public Double getNota2() {
		return nota2;
	}

	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}

	public Double getNota3() {
		return nota3;
	}

	public void setNota3(Double nota3) {
		this.nota3 = nota3;
	}

	public void pass() {
		double notaFinal = getNota1() +  getNota2() + getNota3();
		
		if(notaFinal > 60) {
			System.out.printf("FINAL GRADE = %.2f%n", notaFinal);
			System.out.println("PASS");
		}else {
			System.out.printf("FINAL GRADE = %.2f%n", notaFinal);
			System.out.println("FAILED");
			double notaRestante = 60 - notaFinal;
			System.out.printf("MISSING %.2f POINTS%n", notaRestante);
		}
		
	}

}
