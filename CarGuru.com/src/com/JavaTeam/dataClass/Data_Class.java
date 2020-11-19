
package com.JavaTeam.dataClass;

import java.util.*;


public class Data_Class {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int number = 1;
		 System.out.println("Please enter a choose a drivetrain (1 = Awd, 2= Fwd, 3= Rwd, 4= 4wd)");
		 number = input.nextInt();
		
		 if (number == 1
				 )
			 printAwd();
		
		 if (number == 2)
			 printFwd();
		
		 if (number == 3)
			 printRwd();
		
		 if (number == 4)
			 print4wd();
			
		
	}
	
	private static void print4wd() {
		int number = 0;
		// TODO Auto-generated method stub
		if (number == 1
				 )
			 printAwd();
	}

	private static void printRwd() {
		// TODO Auto-generated method stub
		
	}

	private static void printFwd() {
		// TODO Auto-generated method stub
		
	}

	private static void printAwd() {
		// TODO Auto-generated method stub
		
	}

	public static void One() {
		System.out.println("AWD");
	}
	
	public static void two() {
		System.out.println("FWD");
		
	}
public static void three() {
	System.out.println("RWD");
		
	}
public static void four() {
	System.out.println("4WD");	
}
}



