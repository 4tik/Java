package com.SyntaxError;
import java.util.*;
import java.awt.*;

public class Main {

	public static void main(String[] args) {
		
		byte age = 30;
		long views_count = 3123456789L;
		float price = 10.48F;
		char letter = 'A';
		String name = "Atikur Rahman";
		boolean is_true = true;
		Date date = new  Date();
		
		Point pointer_one = new Point(1, 1);
		Point pointer_two = pointer_one;
		pointer_one.x=2;
		
		String text = new String("Hello WWorld");
		System.out.println(text);
		
		text = "Hello \"World\"";
		System.out.println(text);
		
		System.out.println(pointer_two);
		System.out.println(date.getDate());
		System.out.println(age);
		
		
		int[] numbers  = new int[5];
		
		try
		{
			numbers[0]=10;
			numbers[1]=9;
			String array_string = Arrays.toString(numbers);
			System.out.println(array_string);
		}
		
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
	}

}
