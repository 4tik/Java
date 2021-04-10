package com.SyntaxError;

import java.util.*;

public class Puppy {
	static Scanner scanner = new Scanner(System.in);
	
	int ageValue;
	
	public Puppy(String name)
	{
		System.out.println("\nName : "+name);
	}
	
	public void setAge (int age)
	{
		ageValue = age;
	}
	
	public void getAge()
	{
		System.out.println("Age : "+ageValue);
	}
	
	public static void main(String[] args) {
		
		System.out.print("Enter Name : ");
		String name = scanner.next();
		
		System.out.print(name+"'s age is : ");
		int age = scanner.nextInt();
		
		Puppy puppy = new Puppy(name);
		puppy.setAge(age);
		puppy.getAge();
	}

}
