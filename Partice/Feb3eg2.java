package Partice;

import java.util.Scanner;

public class Feb3eg2 {
	public static void main(String[] args) {

Scanner s=new Scanner(System.in);
		
		System.out.print("Enter number of minute : ");
		int min;
		min=s.nextInt();
		int year,days;
		int yr=60*24*365; //logic for minutes in year
		year=min/yr; // for year 
		System.out.println("Number of years : "+year);
		
		// logic for number of aysdays 
		min=min-(year*yr);
		int day=60*24;
		days=min/day;
		System.out.print("Number of days : "+days);
	}

}
