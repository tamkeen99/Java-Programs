package Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseSnentenvce {

	public static void main(String[] args) {
		
		
		String str="MY Name is Tamkeen";
		
		
		
		String[] words = str.split(" ");
		
		List<String> list = Arrays.asList(words);
		
		
		Collections.reverse(list);
		
		
		for(String c: list) {
			
			System.out.print(c+" ");
			
		}
		
	}
	
	
	
	
}
