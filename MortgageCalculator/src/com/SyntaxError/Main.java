package com.SyntaxError;

import java.util.Scanner;
import java.text.NumberFormat;

public class Main {

	public static void main(String[] args) {
		
		final byte MONTHS_IN_YEAR = 12;
		final byte PERCENT = 100;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Principal: ");
		float principal = scanner.nextFloat();
		
		System.out.print("Annaual Interest Rate: ");
		float annnualInterest = scanner.nextFloat();
		float monthlyInterest = annnualInterest/PERCENT/MONTHS_IN_YEAR;
		
		System.out.print("Period (Years): ");
		byte period = scanner.nextByte();
		int numberOfPayments = (period*MONTHS_IN_YEAR);
		
		double mortage =(monthlyInterest * Math.pow(1+monthlyInterest, numberOfPayments))
				/(Math.pow(1+monthlyInterest, numberOfPayments)-1);
		mortage = (mortage*principal);
		
		String mortagageFornatted = NumberFormat.getCurrencyInstance().format(mortage);
		
		System.out.print("Mortage :"+mortagageFornatted);
	}

}
