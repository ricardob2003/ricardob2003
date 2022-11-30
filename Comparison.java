package HashMapPractice;


import java.util.Scanner;

import java.time.temporal.ChronoUnit;
import java.lang.String;
import java.time.*;
import java.util.HashMap;

public class Comparison {
	public static void main(String[] args) {
		int[][] matrix = new int[5][5];
		System.out.println(matrix);
		

//		Scanner scan = new Scanner(System.in);
//
//		System.out.print("Please enter the First Person's name ");
//		String name1 = scan.nextLine();
//
//		System.out.print("Please enter the First' Person's age ");
//		int age1 = scan.nextInt();
//		scan.nextLine();
//
//		System.out.println("Please enter the Second Person's name ");
//		String name2 = scan.nextLine();
//
//		System.out.print("Please enter the Second Person's Age ");
//		int age2 = scan.nextInt();
//		scan.nextLine();
//		
//
//		System.out.println("\nThe Information entered for the 1st Person is the following: " + "[ " + name1 + " ]" + "[ "
//				+ age1 + " ]");
//		System.out.println("The Information entered for the 2nd Person is the following: " + "[ " + name2 + " ]" + "[ "
//				+ age2 + " ]\n");
//		
//		int yeardifference = age1-age2;
//		yeardifference = Math.abs(yeardifference);
//		
//		if (age1 > age2) {
//			System.out.println(name1 + " is older than " + name2 + " by " + yeardifference + " years");
//		} else {
//			System.out.println(name2 + " is older than " + name1 + " by " + yeardifference + " years");
//		}
//		System.out.println("We will now calculate age difference in days");
//		
//		HashMap<String, Integer> months = new HashMap<String, Integer>();
//		months.put("January", 1);
//		months.put("February", 2);
//		months.put("March", 3);
//		months.put("April", 4);
//		months.put("May", 5);
//		months.put("June", 6);
//		months.put("July", 7);
//		months.put("August", 8);
//		months.put("September", 9);
//		months.put("October", 10);
//		months.put("November", 11);
//		months.put("December", 12);
//
//		System.out.println("Please enter " + name1 + "'s" + " birth month");
//		String month1 = scan.nextLine();
//		month1 = month1.trim();
//		int m1value = 0;
//		int m2value = 0;
//		if (months.containsKey(month1)) {
//			Integer m1 = months.get(month1);
//			m1value = m1;
//			System.out.println(" The value of " + month1 + " is " + m1);
//		} else {
//			System.out.println("This is not a valid month");
//		}
//		System.out.println("Please enter " + name2 + "'s" + " birth month");
//		String month2 = scan.nextLine();
//		month2 = month2.trim();
//		if (months.containsKey(month2)) {
//			Integer m2 = months.get(month2);
//			m2value = m2;
//		} else {
//			System.out.println("This is not a valid month");
//		}
//		
//		System.out.println("Please enter " + name1 + "'s" + " birth year");
//		int year1 = scan.nextInt();
//		scan.nextLine();
//
//		System.out.println("Please enter " + name2 + "'s" + " birth year");
//		int year2 = scan.nextInt();
//		
//		System.out.println("Please enter " + name1 + "'s" + " day of birth");
//		int day1 = scan.nextInt();
//		scan.nextLine();
//
//		System.out.println("Please enter " + name2 + "'s" + " day of birth");
//		int day2 = scan.nextInt();
//		
//		LocalDate p1_date = LocalDate.of(year1, m1value, day1);
//		LocalDate p2_date = LocalDate.of(year2, m2value, day2);
// 
//		System.out.println(p1_date);
//		System.out.println(p2_date);
//		
//		long elapsedDays = ChronoUnit.DAYS.between(p1_date, p2_date);
//		System.out.println(elapsedDays); 
//		System.out.println("The age difference in days between " + name1 + " and " + name2 + " is of " 
//		+ elapsedDays + " amount of days");
	}

}
