package TAm;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemovingrepeatedCharsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="tatttttyytuyuyiuyiuyiuyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyymkeen";
		
		
		Set<Character>a1=new LinkedHashSet<Character>();
		
		for(int i=0; i<s.length(); i++) {
			
			a1.add(s.charAt(i));
		
			
		}
		StringBuffer sf= new StringBuffer();
		for(Character c: a1) {
		sf.append(c);
		}
		
		System.out.println(sf);
		
	}

}
