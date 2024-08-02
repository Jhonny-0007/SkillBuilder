package com.jhonny.exerciciofixacao4;

import java.util.Scanner;

public class Account {
	private Integer numberAcount;
	private String holder;
	private Double amount;
	
	public Account() {
		this.amount = 0.0;
	}
	
	public Account(Integer numberAcount, String holder, Double amount) {
		this.numberAcount = numberAcount;
		this.holder = holder;
		this.amount = amount;
	}

	public Integer getNumberAcount() {
		return numberAcount;
	}

	public void setNumberAcount(Integer numberAcount) {
		this.numberAcount = numberAcount;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public void registry() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter account number: ");
		setNumberAcount(scanner.nextInt());
		System.out.print("Enter account holder: ");
		setHolder(scanner.next());
		System.out.println("Is there na initial deposit (y/n)? ");
		String selection = scanner.nextLine();
		if(selection.equals("y")) {
			
		}else {
			System.out.println("Account data: ");
			System.out.println("Account " + getNumberAcount() + ", Holder: " + getHolder() + ", Balance: $ " + getAmount());
		}

		scanner.close();
	}
	
	public double deposit() {
	
		return getAmount();
	}

}
