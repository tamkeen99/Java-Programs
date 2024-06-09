package Practice;

import java.util.HashMap;
import java.util.Map;

public class DulpicateCharAndNooftimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="tamkeen good boy";
		String sp=s.replaceAll("[\\s]", "");
		
		char[] ch = sp.toCharArray();
		
	Map<Character,Integer>al=new HashMap<Character,Integer>();
	
	
		for(Character c : ch) {
			
			if(al.containsKey(c)) {
				
				al.put(c, al.get(c)+1);
			}
			
			else {
				
				al.put(c,1);
			}
			
		}
			
			for(Character c1 : al.keySet()) {
				
				if( al.get(c1)>1) {
					
				System.out.println("Character "+c1+"  is repeated  "+al.get(c1)+  " times");
					
				}
				
			}
		}
		
		
		
	}


