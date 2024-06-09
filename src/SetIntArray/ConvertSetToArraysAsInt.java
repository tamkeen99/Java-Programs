package SetIntArray;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ConvertSetToArraysAsInt {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int[] arr= {-1,-3,-3,15,6,7,9,14,5}; // Example array of numbers
	        
	       // Sort the array in ascending order
	        Arrays.sort(arr);
	       //as arrays element are repeated so we can extract array elements and add to Set to avoid duplicate elements
	        Set<Integer>m= new TreeSet<Integer>();
            for( int i=0; i<arr.length;i++) {
	
	            m.add(arr[i]);
                   }
           
            // Here we are converting set to Arrays i.e new Array narr.
           Integer[] narr = m.toArray(new Integer[0]);
        
	        int distinctCount = 1;
	        for (int i =1; i<narr.length-1; i++) {
	            if (arr[i]!= narr[i + 1]) {
	                distinctCount++;
	            }
	            if (distinctCount == 3       ) {
	              System.out.println(arr[i]+"this");
	            }
	        }
	        // If the array doesn't have a third distinct element, return the maximum element
	   
		
	
	    }
}
