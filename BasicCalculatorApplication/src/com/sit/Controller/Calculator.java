package com.sit.Controller;

public class Calculator {
	// Code For Addition
		public static int add(int a, int b) {
			return a + b;
		}

		// Code For Substraction
		public static int sub(int a, int b) {
			return a - b;
		}

		// Code for Multiplication
		public static int mul(int a, int b) {
			return a * b;
		}

		// Code for Division
		public static void div(int a, int b) {
			
			try {
				System.out.println("Division is: "+a/b);
			} catch (Exception e) {
				System.out.println("Divided by zero operation cannot possible");
			}
		}

		//Code for Finding Modulo
		public static int findModulo(int a, int b) {
			return a%b;
			
		}

}
