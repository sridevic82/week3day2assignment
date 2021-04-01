package week3day2;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

import net.bytebuddy.implementation.ToStringMethod;

public class DuplicateRemove {

	public static void main(String[] args) {
		//Declaring a string
		
		String companyName ="PayPal India";
		
		//Convert string to char array
		
		char[] charArray = companyName.toCharArray();
		
		//declare arraylist
		
		ArrayList <Character> list=new ArrayList<Character>();
		
		//Addiing characters to a listarray
		
		for (int i = 0; i < charArray.length; i++) {
			
			list.add(charArray[i]);
			}
		
		//declare set to get unique values
		
		Set<Character> charset=new LinkedHashSet<Character>(list);
		
		//convert character to string
		
		for (Character character : charset) {
			
			String string = character.toString();
			System.out.print(string);
		}

	}

}
