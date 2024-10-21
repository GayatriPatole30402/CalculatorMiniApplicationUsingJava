package com.sit.Client;

import java.util.Scanner;

import com.sit.Controller.Calculator;

public class CalculatorApplication {

	public static void main(String[] args) {

		System.out.println("---------------* Welcome to Calcuator Application *----------------");

		Scanner sc = new Scanner(System.in);
		boolean flag = true;

		while (flag) {
			System.out.println(
					"Options:->\n 1. Addition \n 2. Substraction \n 3. Multiplication \n 4. Division \n 5. Find Modulo \n 6.Exit");
			System.out.println("Select Only One option at a time:---->");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter 1st Number:-");
				int a = sc.nextInt();
				System.out.println("Enter 2nd Number:->");
				int b = sc.nextInt();
				System.out.println("Addition is: " + Calculator.add(a, b));
				System.out.println("_________________________________________________");
				break;
			case 2:
				System.out.println("Enter 1st Number:-");
				a = sc.nextInt();
				System.out.println("Enter 2nd Number:->");
				b = sc.nextInt();
				System.out.println("Substraction is: " + Calculator.sub(a, b));
				System.out.println("_________________________________________________");
				break;

			case 3:
				System.out.println("Enter 1st Number:-");
				a = sc.nextInt();
				System.out.println("Enter 2nd Number:->");
				b = sc.nextInt();
				System.out.println("Multiplication is: " + Calculator.mul(a, b));
				System.out.println("_________________________________________________");
				break;

			case 4:
				System.out.println("Enter 1st Number:-");
				a = sc.nextInt();
				System.out.println("Enter 2nd Number:->");
				b = sc.nextInt();
				Calculator.div(a, b);
				System.out.println("_________________________________________________");
				break;

			case 5:
				System.out.println("Enter 1st Number:-");
				a = sc.nextInt();
				System.out.println("Enter 2nd Number:->");
				b = sc.nextInt();
				System.out.println("Modulus is: " + Calculator.findModulo(a, b));
				System.out.println("_________________________________________________");
				break;

			case 6:
				System.out.println("Thank you for using this application!!!!");
				System.exit(0);

			default:
				System.out.println("Please Choose Option from given MENU :( ");
				break;
			}
		}

	}

}
