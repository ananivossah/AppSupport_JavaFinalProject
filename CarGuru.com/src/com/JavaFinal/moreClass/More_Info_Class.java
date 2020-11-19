package com.JavaFinal.moreClass;

import java.util.*;


	public class More_Info_Class {
		public static void main(String[] args) {
			Scanner input = new Scanner (System.in);
			
			int number = 1;
			 System.out.println("Please select drivetrain (1 = AWD, 2 = FWD, 3 = RWD, 4 = 4WD)");
			 number = input.nextInt();
			
			 if (number == 1)
				 printAWD();
			
			 if (number == 2)
				 printFWD();
			
			 if (number == 3)
				 printRWD();
			
			 if (number == 4)
				 print4WD();
				
		}
		
		
		public static void printAWD() {
			System.out.println("You have selected AWD");
		}
		
		public static void printFWD() {
			System.out.println("You have selected FWD");
			
		}
	public static void printRWD() {
		System.out.println("You have selected RWD");
			
		}
	public static void print4WD() {
		System.out.println("You have selected 4WD");	
	}
	

}
