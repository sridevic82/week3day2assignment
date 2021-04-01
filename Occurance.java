package week3day2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		       //Declaring a string
		       String val="Sridevi";	
		       
		       //converting string to character array
			   char[] charArray = val.toCharArray();
			   
			   //creating map
			   Map<Character, Integer> map=new LinkedHashMap<Character, Integer>();
			   
			   //putting keys and values in map
			  for (char ch : charArray) {
				  
				  if(map.containsKey(ch))
				  {
					  map.put(ch, map.get(ch)+1);
				  }
				  else
				  {
					  map.put(ch,1);
				  }
			  }
		
				System.out.println(map);
			
			  
			   
			   
		

	
}
}