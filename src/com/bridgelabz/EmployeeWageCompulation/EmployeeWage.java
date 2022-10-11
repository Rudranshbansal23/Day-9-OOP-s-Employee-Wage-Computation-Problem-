package com.bridgelabz.EmployeeWageCompulation;

import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Function");
		
		int wagePerHour = 20;
		int fullDayHours = 8;
		int partTimeHours = 4;
		int salary = 0;

		Random random = new Random();
		int randomNum = random.nextInt(3); // 0-1-2

		switch (randomNum) {
		case 0:
			System.out.println("Employee is absent");
			break;
		case 1:
			System.out.println("Employee is present");
			salary = wagePerHour * fullDayHours;
			break;
		case 2:
			System.out.println("Employee worked for Part-Time");
			salary = wagePerHour * partTimeHours;
			break;
		}
		System.out.println("Employee salary is : " + salary);
	}

}