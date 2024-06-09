package ImportantStringProbs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ThirdSmallestnum {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int[] arr= {-1,-3,-3,15,6,7,9,14,5}; // Example array of numbers
	        
	       // Removing duplicate array
		   
		   Set<Integer>n=new HashSet<Integer>();
		   
		   for( int d:arr) {
			   
			   n.add(d);
		   }
		   //converting set to Array[]
		Integer[] arrwd = n.toArray(new Integer[0]);
		   
	        Arrays.sort(arrwd);
	       
        
	        int distinctCount = 1;
	        for (int i =1; i<arrwd.length-1; i++) {
	            if (arrwd[i]!= arrwd[i + 1]) {
	                distinctCount++;
	            }
	            if (distinctCount == 3       ) {
	              System.out.println(arrwd[i]);
	            }
	        }
	        // If the array consist duplicate elements them it wont fetch exact element ie 3rd smallest element.
	        // so extract elements and add to set and then convert it to array using toArray method.
	        //then duplicated values will be removed.
	        // to under stand refer SetIntArray Package (ConvertSetToArray class).
		
	
	    }
}
