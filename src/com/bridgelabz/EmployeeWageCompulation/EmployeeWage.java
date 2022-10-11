package com.bridgelabz.EmployeeWageCompulation;

import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Function");
		
		int wagePerHour = 20;
		int fullDayHours = 8;
		int partTimeHours = 4;
		int salary = 0;
		int workingDayPerMonth = 20;
		int monthlySalary = 0;
		
		for (int i = 1; i <= workingDayPerMonth; i++) {
			Random random = new Random();
			int randomNum = random.nextInt(3);

			switch (randomNum) {
			case 0:
				System.out.println("Employee is absent");
				break;
			case 1:
				System.out.println("Employee is present");
				salary = wagePerHour * fullDayHours;

				break;
			case 2:
				System.out.println("Employee worked for Part Time");
				salary = wagePerHour * partTimeHours;
				break;
			}
			monthlySalary = monthlySalary + salary;
		}
		System.out.println("Employee Monthly salary is : " + monthlySalary);

	}

}