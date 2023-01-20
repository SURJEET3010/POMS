/**
 * 
 */
package com.poms.util;

/**
 * @author Surjeet
 *
 */
public class ShowText {
	
	private static int lineLength = 50;  
	
	
	// Print the strip 
	public static void inCenter(String s) {
		
		int limit = lineLength-(s.length())-2;
		
		for (int iterator = 0; iterator <= limit; iterator ++) {
			if(iterator == (int)limit/2)
			{
				System.out.print(" "+s+" ");
			}else
			System.out.print("-");
		}
		System.out.println();
	}
	
	
	// show text in left with some padding
	public static void inLeft(String s) {
		
		for (int iterator = 0; iterator <=40; iterator ++) {
			if(iterator == 8)
			{
				System.out.print(s);
			}else
			System.out.print(" ");
		}
		System.out.println();
	}
	
	// show text in left with some padding
		public static void addStrip() {
			
			for (int iterator = 1; iterator <=lineLength; iterator ++) {
				System.out.print("=");
			}
			System.out.println();

		}
	
		

}
