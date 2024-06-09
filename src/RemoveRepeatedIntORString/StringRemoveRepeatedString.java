package RemoveRepeatedIntORString;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StringRemoveRepeatedString {

	public static void main(String[] args) {
		
		String s= "Tamfdhfshsfhkeen";
		
		HashSet<Character>a1=new LinkedHashSet<Character>();
		
		
	for(int i=0; i<s.length(); i++) {
			
			a1.add(s.charAt(i));
		
			
		}
		
	StringBuffer s1= new StringBuffer();
	for(Character sc: a1) {
		s1.append(sc);
	}
	System.out.println(s1);
	}
}
