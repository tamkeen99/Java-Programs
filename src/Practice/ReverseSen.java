package Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseSen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="mk s ss  ff f s rf fjnfrfb";
		
		String[] words = str.split(" ");
		
		
		List<String> list = Arrays.asList(words);
		
		
		Collections.reverse(list);
		
		
		
		for(String c : list) {
			
			System.out.print(c+" ");
			
		}
		
	}

}
