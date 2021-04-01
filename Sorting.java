package week3day2;

import java.util.Arrays;



public class Sorting {

	public static void main(String[] args) {
		
		String[] input= new String[4];
		input[0]="HCL";
		input[1]="Wipro";
		input[2]="Aspire Systems";
		input[3]="CTS";
		
		//Length of array
		System.out.println(input.length);
		//Sorting The Array
		Arrays.sort(input);
		System.out.println("****************");
		System.out.println("The Reverse order is");
		//Sorting the array in reverse order
		for (int i = input.length-1; i >=0; i--) {
			
			System.out.print( input[i]+"," );
			
			
		}
			
			
			
			
			
		}
				
		
		

	}


