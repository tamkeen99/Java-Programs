package NumbersProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Sortt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] num= {2,6,4,8,2,5,6};
		
		
		Set<Integer>z=new HashSet<Integer>();
		
		for(int i=0;i<num.length;i++) {
		     z.add(num[i]);              //adding array element to set
		}
		
		
		for(Integer c: z) {
			System.out.print(c);   //Unique element will be printed b/c set allows unique value;
		}
		
		System.out.println();
		System.out.println(z);
		
		List<Integer>l= new ArrayList<Integer>(z);  // if we want to reverse element in set it is not possible so we have to convert it to List then we can reverse them. 
		
	Collections.reverse(l);
		
		
		for(Integer c: l) {
			System.out.print(c);
		}
	}
	

}


