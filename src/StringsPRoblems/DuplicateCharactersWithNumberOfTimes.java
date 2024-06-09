package StringsPRoblems;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersWithNumberOfTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String str="MynameisTamkeenuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuulllllllllllllllllllllllllll";
		
		String ls = str.toLowerCase();
		
		
		char[] ch=ls.toCharArray();
		
		
		Map<Character,Integer> m=new HashMap<Character,Integer>();
		
		for(Character c: ch) {
			
			if(m.containsKey(c)) {
				
				m.put(c,m.get(c)+1);
			}
			else {
				
				m.put(c, 1);
			}
		}
		
		for(Character c: m.keySet()) {
			
			if(m.get(c)>1) {
				
				System.out.println("Character "+c+" is repeated "+m.get(c)+"times");
			}
		}
		
	}

}
